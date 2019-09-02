package com.minges.backend.Controllers;

import com.minges.backend.Entities.Carrera;
import com.minges.backend.Repositories.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping("/carreras")
    public List<Carrera> getAll(){return repository.findAll(); }
}
