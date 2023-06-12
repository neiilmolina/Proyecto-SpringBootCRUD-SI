package com.example.ejercicioSpringBoot.DAO;

import com.example.ejercicioSpringBoot.Modelo.Usuario;

import java.util.List;

public interface UsuarioDAO {

    List<Usuario> listarUsuarios();
    void deleteUsuarios(int id);

    void addUsuarios(Usuario item);

    void editUsuarios(int id, String nombre, String password, String email, int rol);
}
