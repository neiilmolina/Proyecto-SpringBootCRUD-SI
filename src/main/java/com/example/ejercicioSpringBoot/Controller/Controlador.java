package com.example.ejercicioSpringBoot.Controller;

import com.example.ejercicioSpringBoot.DAO.AlumnoDAO;
import com.example.ejercicioSpringBoot.DAO.UsuarioDAO;
import com.example.ejercicioSpringBoot.Modelo.Alumno;
import com.example.ejercicioSpringBoot.Modelo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controlador {  
    @Autowired
    AlumnoDAO alumnoDAO;

    @GetMapping("/listarAlumno")
    public List<Alumno> listarAlumnos(){
        return alumnoDAO.listarAlumnos();
    }

    @DeleteMapping("/eliminarAlumno/{id}")
    public void deleteAlumnos(@PathVariable int id){
        alumnoDAO.deleteAlumnos(id);
    }

    @PostMapping("/añadirAlumno")
    public void addAlumnos(@RequestBody Alumno alumno){
        alumnoDAO.addAlumnos(alumno);
    }

    @Autowired
    UsuarioDAO usuarioDAO;
    @GetMapping("/listarUsuario")
    public List<Usuario> listarUsuarios(){
        return usuarioDAO.listarUsuarios();
    }

    @DeleteMapping("/eliminarUsuario/{id}")
    public void deleteUsuarios(@PathVariable int id){
        usuarioDAO.deleteUsuarios(id);
    }

    @PostMapping("/añadirUsuario")
    public void addUsuarios(@RequestBody Usuario usuario){
        usuarioDAO.addUsuarios(usuario);
    }
}
