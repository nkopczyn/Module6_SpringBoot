package pl.coderslab.module6_springboot.api;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Product {
    private int id;
    private String title;
    private String description;
    private int stock;
}