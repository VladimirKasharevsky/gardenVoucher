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
    private String house;
    private String vocations;
    private String queueCount;

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

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getVocations() {
        return vocations;
    }

    public void setVocations(String vocations) {
        this.vocations = vocations;
    }

    public String getQueueCount() {
        return queueCount;
    }

    public void setQueueCount(String queueCount) {
        this.queueCount = queueCount;
    }
}
