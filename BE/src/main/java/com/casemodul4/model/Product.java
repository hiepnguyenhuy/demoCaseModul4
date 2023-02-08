package com.casemodul4.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduct;
    private String name;
    private String description;
    private double prince;
    private String status;

    @ManyToOne
    private Category category;
}
