package com.example.demo.controllers;

import com.example.demo.models.Alumno;
import com.example.demo.repositories.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class AlumnoController {

    @Autowired
    AlumnoRepository repository;

    @GetMapping("/alumnos")
    public List<Alumno> getAll(){return repository.findAll();}

    @PostMapping("/alumno")
    Alumno insertAlumno(@RequestBody Alumno newAlumno){
        return repository.save(newAlumno);
    }

    @GetMapping("/alumno/{id}")
    Alumno getAlumnoId(@PathVariable Long id){
        return repository.findAlumnoById(id);
    }
}
