package com.example.demo;

import com.example.demo.models.Alumno;
import com.example.demo.repositories.AlumnoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BackendTests {

    @Autowired
    AlumnoRepository alumnoRepository;

    @Test
    public void findAlumnoById() {

        Alumno alumno = new Alumno();
        alumno.setId(1L);
        alumno.setName("Jhon");
        alumno.setRut("12.345.678-9");
        alumno.setCarrera("Ingenieria Informatica");
        alumno.setNacimiento("10-10-10");
        alumno.setPhoto("none");

        alumnoRepository.save(alumno);

        assertEquals("Jhon", alumnoRepository.findAlumnoById(1L).getName());
        //assertEquals("Jhon", "Jhon");
    }

}
