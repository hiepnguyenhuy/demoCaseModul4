package com.casemodul4.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ProductImg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProductImg;
    private String nameImg;

    @ManyToOne
    private Product product;
}
