package com.example.ejercicioSpringBoot.DAO;

import com.example.ejercicioSpringBoot.Modelo.Alumno;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class AlumnoDAOImp implements AlumnoDAO {

    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<Alumno> listarAlumnos() {
        String query = "FROM Alumno";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void deleteAlumnos(int id) {
        Alumno item = entityManager.find(Alumno.class,id);
        entityManager.remove(item);
    }

    @Override
    public void addAlumnos(Alumno item) {
        entityManager.merge(item);
    }

    @Override
    public void editAlumnos(int id, String nombre, float nota, int periodo) {

    }


}
