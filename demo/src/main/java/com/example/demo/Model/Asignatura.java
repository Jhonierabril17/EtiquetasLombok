package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

/*
  Clase que representa una asignatura en el sistema.
  Contiene información sobre la asignatura y sus relaciones con los estudiantes y los profesores.
 */
@Entity
@Table(name = "asignatura")
@Getter
@Setter
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    /*
      Relación de muchos a muchos con la clase Estudiante.
      Una asignatura puede tener múltiples estudiantes inscritos.
      La relación es mapeada por el atributo asignaturas en la clase Estudiante.
     */
    @ManyToMany(mappedBy = "asignaturas")
    private List<Estudiante> estudiantes;
    /*
      Relación de muchos a muchos con la clase Profesor.
      Una asignatura puede tener múltiples profesores.
      La relación se define en la tabla de unión 'asignatura_profesor'.
     */
    @ManyToMany
    @JoinTable(
            name = "asignatura_profesor",
            joinColumns = @JoinColumn(name = "asignatura_id"),
            inverseJoinColumns = @JoinColumn(name = "profesor_id")
    )
    private List<Profesor> profesores;
}

