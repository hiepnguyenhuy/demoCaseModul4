package com.casemodul4.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCommnent;
    public String content;

    @ManyToOne
    private User user;
    @ManyToOne
    private Product product;
}
