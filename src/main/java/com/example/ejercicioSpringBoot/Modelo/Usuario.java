package com.example.ejercicioSpringBoot.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Table(name = "usuario")
@ToString
@EqualsAndHashCode
@Entity
public class Usuario {
    @Id
    @Column(name = "id_usuario")
    private int id_usuario;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;

    @Column(name = "rol")
    private int rol;
}
