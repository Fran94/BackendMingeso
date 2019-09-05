package com.example.demo.controllers;

import com.example.demo.models.Carrera;
import com.example.demo.repositories.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class CarreraController {

    @Autowired
    CarreraRepository repository;

    public Sort sortByName(){
        return new Sort(Sort.Direction.ASC, "name");
    }

    @GetMapping("/carreras")
    public List<Carrera> getAll(){return repository.findAll(sortByName()); }
}
