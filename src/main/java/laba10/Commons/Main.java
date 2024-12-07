package laba10.Commons;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/java/laba10/Commons/text.txt");

        List<String> text = List.of(
                "У лукоморья дуб зелёный;",
                "Златая цепь на дубе том:",
                "И днём и ночью кот учёный",
                "Всё ходит по цепи кругом;"
        );
        File copyFile = new File("src/main/java/laba10/Commons/copy_text.txt");

        List<String> newLines = List.of(
                "Идёт направо — песнь заводит,",
                "Налево — сказку говорит.",
                "Там чудеса: там леший бродит,"
        );

        String newString = "Русалка на ветвях сидит;";

        // создаем файл
        createFile(file, text);
        // создаем копию файла
        copyFile(file, copyFile);
        // читаем файл
        readFile(file);
        // смотрим размер исходного файла
        getSizeFile(file);
        // добавляем в скопированный файл новою строку
        addLineToFile(copyFile, newLines);
        // добавляем в скопированный файл лист строк
        addStringToFile(copyFile, newString);
        // читаем файл
        readFile(copyFile);
        // смотрим размер скопированного файла
        getSizeFile(copyFile);
    }

    public static void createFile(File file, List<String> text) throws IOException {
        FileUtils.writeLines(file, text);
    }

    public static void copyFile(File file, File copyFile) throws IOException {
        FileUtils.copyFile(file, copyFile);
    }

    public static void readFile(File file) throws IOException {
        List<String> readText = FileUtils.readLines(file, "utf-8");
        for (String line: readText) {
            System.out.println(line);
        }
    }

    public static void getSizeFile(File file) throws IOException {
        long size = FileUtils.sizeOf(file);
        System.out.println(size);
    }

    public static void addLineToFile(File file, List<String> lines) throws IOException {
        FileUtils.writeLines(file, "utf-8", lines,  true);
    }

    public static void addStringToFile(File file, String string) throws IOException {
        FileUtils.writeStringToFile(file, string, "utf-8", true);
    }
}
