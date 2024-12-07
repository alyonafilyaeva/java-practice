package laba10.Jackson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@ToString
public class Dress {
    private String title;
    private String color;
    private int size;
    private double cost;

}
