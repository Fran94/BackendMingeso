package com.example.demo.models;

import lombok.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "carreras")
public class Carrera {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String name;

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
}
