package com.example.ejercicioSpringBoot.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Table(name = "alumno")
@ToString
@EqualsAndHashCode
@Entity
public class Alumno {
    @Id
    @Column(name = "id_alumno")
    private int id_alumno;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "nota")
    private float nota;
    @Column(name = "periodo")
    private int periodo;
}
