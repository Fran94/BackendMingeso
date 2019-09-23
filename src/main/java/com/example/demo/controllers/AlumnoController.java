package com.example.demo.controllers;

import com.example.demo.models.Alumno;
import com.example.demo.repositories.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class AlumnoController {

    @Autowired
    AlumnoRepository repository;

    public Sort sortByName(){
        return new Sort(Sort.Direction.ASC, "name");
    }

    @GetMapping("/alumnos")
    public List<Alumno> getAll(){return repository.findAll(sortByName());}

    @PostMapping("/alumno")
    public Alumno insertAlumno(@RequestBody Alumno newAlumno){
        return repository.save(newAlumno);
    }

    @GetMapping("/alumno/{id}")
    public Alumno getAlumnoId(@PathVariable Long id){
        return repository.findAlumnoById(id);
    }

    @DeleteMapping("/alumno/{id}")
    public void deleteAlumnoId(@PathVariable Long id) {repository.delete(repository.findAlumnoById(id));}
    
}
