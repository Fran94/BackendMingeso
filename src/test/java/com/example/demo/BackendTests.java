package com.example.demo;

import com.example.demo.controllers.AlumnoController;
import com.example.demo.controllers.CarreraController;
import com.example.demo.models.Alumno;
import com.example.demo.models.Carrera;
import com.example.demo.repositories.AlumnoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BackendTests {

    @Autowired
    AlumnoController controller;

    @Autowired
    CarreraController carreraController;

    @Test
    public void findAlumnoById() {

        Alumno alumno = new Alumno();
        alumno.setName("Johnny Rockets");
        alumno.setRut("12.345.678-9");
        alumno.setCarrera("Ingeniería Civil en Ambiente");
        alumno.setNacimiento("10-10-10");
        alumno.setPhoto("none");
        controller.insertAlumno(alumno);
        assertEquals("Johnny Rockets", controller.getAlumnoId(alumno.getId()).getName());
        controller.deleteAlumnoId(alumno.getId());
    }

    @Test
    public void findCarreraAll() {
        List<Carrera> carreraList;
        carreraList = carreraController.getAll();
        assertFalse(carreraList.isEmpty());
    }

    @Test
    public void findAlumnoAll(){
        List<Alumno> alumnoArrayList;
        alumnoArrayList = controller.getAll();
        assertFalse(alumnoArrayList.isEmpty());
    }
}
