package com.example.demo.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "alumnos")
public class Alumno {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 127)
    private String name;

    @Column(name = "rut", nullable = false, length = 20)
    private String rut;

    @Column(name = "carrera", nullable = false, length = 255)
    private String carrera;

    @Column(name = "nacimiento", nullable = false, length = 255)
    private Date nacimiento;
}
