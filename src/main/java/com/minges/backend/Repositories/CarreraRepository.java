package com.minges.backend.Repositories;

import com.minges.backend.Entities.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarreraRepository extends JpaRepository<Carrera, Long> {
    Carrera findCarreraById(Long id);
}
