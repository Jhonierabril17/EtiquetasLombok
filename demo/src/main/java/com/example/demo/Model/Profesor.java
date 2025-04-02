package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "profesor")
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;

    @OneToOne
    @JoinColumn(name = "detalle_profesor_id")
    private DetalleProfesor detalleProfesor;

    public Profesor() {}

    public Profesor(Long id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public DetalleProfesor getDetalleProfesor() {
        return detalleProfesor;
    }

    public void setDetalleProfesor(DetalleProfesor detalleProfesor) {
        this.detalleProfesor = detalleProfesor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
