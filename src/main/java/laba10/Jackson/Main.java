package laba10.Jackson;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        // writeDressToJson();
        // readDressFromJson();

        readUnknownJson();
        readBookJson();
    }

    public static void writeDressToJson() throws IOException {
        Dress dress = new Dress();
        dress.setTitle("Летнее платьишко");
        dress.setColor("blue");
        dress.setSize(42);
        dress.setCost(2000);

        File file = new File("src/main/java/laba10/Jackson/dress.json");
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(dress);
        FileUtils.write(file, json, "utf-8");
    }

    public static void readDressFromJson() throws IOException {
        File file = new File("src/main/java/laba10/Jackson/dress.json");

        ObjectMapper mapper = new ObjectMapper();
        Dress dress = mapper.readValue(file, Dress.class);
        System.out.println(dress);
    }

    public static void readUnknownJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> map = mapper.readValue(
                new File("src/main/java/laba10/Jackson/object.json"),
                new TypeReference<>() {}
        );

        for (String key: map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }

    public static void readBookJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Book> books = mapper.readValue(
                new File("src/main/java/laba10/Jackson/input.json"),
                new TypeReference<>() {}
        );

        for (Book book: books) {
            System.out.println(book.getId());
        }
    }
}
