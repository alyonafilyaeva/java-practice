package laba10.Jackson;

import lombok.*;

import java.util.List;

@Data
public class Book {
    private int id;
    private String title;
    private String isbn;
    private int pageCount;
    private List<String> authors;

}
