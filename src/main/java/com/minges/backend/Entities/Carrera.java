package com.minges.backend.Entities;

import lombok.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "carrera")
public class Carrera {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String name;
}
