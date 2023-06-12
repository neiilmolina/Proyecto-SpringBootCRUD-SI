package com.example.ejercicioSpringBoot.DAO;

import com.example.ejercicioSpringBoot.Modelo.Alumno;

import java.util.List;

public interface AlumnoDAO {
    List<Alumno> listarAlumnos();
    void deleteAlumnos(int id);

    void addAlumnos(Alumno item);

    void editAlumnos(int id, String nombre, float nota, int periodo);
}
