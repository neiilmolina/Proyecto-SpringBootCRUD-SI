package com.example.ejercicioSpringBoot.DAO;

import com.example.ejercicioSpringBoot.Modelo.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Repository
public class UsuarioDAOImp implements UsuarioDAO {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<Usuario> listarUsuarios() {
        String query = "FROM Usuario";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void deleteUsuarios(int id) {
        Usuario item = entityManager.find(Usuario.class,id);
        entityManager.remove(item);
    }

    @Override
    public void addUsuarios(Usuario item) {
        entityManager.merge(item);
    }

    @Override
    public void editUsuarios(int id, String nombre, String password, String email, int rol) {
        Usuario item = entityManager.find(Usuario.class,id);
    }
}
