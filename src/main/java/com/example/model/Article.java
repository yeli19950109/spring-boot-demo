package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Article")
public class Article {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false)
    private String id;


    @Column(name="title", unique=true, nullable=false)
    private String title;
}
