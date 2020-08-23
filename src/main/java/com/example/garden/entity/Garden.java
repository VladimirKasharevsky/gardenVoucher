package com.example.garden.entity;

import javax.persistence.*;

@Entity
@Table(name = "garden")
public class Garden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String street;


    public Garden() {
    }

    public Garden(Long id, String name, String street) {
        this.id = id;
        this.name = name;
        this.street = street;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
