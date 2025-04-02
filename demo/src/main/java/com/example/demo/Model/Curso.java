package com.example.demo.Model;

import jakarta.persistence.*;
import java.util.List;

/*
  Clase que representa un curso en el sistema.
  Contiene información básica sobre el curso y su relación con los estudiantes.
 */
@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    private String nombre;

    /*
      Relación de muchos a muchos con la clase Estudiante.
      Un curso puede tener múltiples estudiantes inscritos.
      La relación es mapeada por el atributo 'cursos' en la clase Estudiante.
     */
    @ManyToMany(mappedBy = "cursos")
    private List<Estudiante> estudiantes;

    public Curso() {
    }

    public Curso(long codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
