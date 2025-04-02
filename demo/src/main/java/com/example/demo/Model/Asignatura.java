package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name = "asignatura")
@Getter
@Setter
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @ManyToMany(mappedBy = "asignaturas")
    private List<Estudiante> estudiantes;

    @ManyToMany
    @JoinTable(
            name = "asignatura_profesor",
            joinColumns = @JoinColumn(name = "asignatura_id"),
            inverseJoinColumns = @JoinColumn(name = "profesor_id")
    )
    private List<Profesor> profesores;
}

