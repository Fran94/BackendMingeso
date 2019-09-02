package com.example.demo.repositories;


import com.example.demo.models.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarreraRepository extends JpaRepository<Carrera, Long> {
    Carrera findCarreraById(Long id);
}
