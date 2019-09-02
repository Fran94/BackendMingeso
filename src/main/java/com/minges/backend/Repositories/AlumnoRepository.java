package com.minges.backend.Repositories;

import com.minges.backend.Entities.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
    Alumno findAlumnoById(Long id);
    Alumno findAlumnoByCarrera(String carrera);
    Alumno findAlumnoByRut(String rut);
}
