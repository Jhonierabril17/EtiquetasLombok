package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "detalle_profesor")
public class DetalleProfesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String direccion;
    private String telefono;

    @OneToOne(mappedBy = "detalleProfesor")
    private Profesor profesor;

    public DetalleProfesor() {}

    public DetalleProfesor(Long id, String direccion, String telefono) {
        this.id = id;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
