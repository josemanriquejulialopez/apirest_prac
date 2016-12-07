package com.example.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Atleta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String apellidos;
    private String nacionalidad;
    private LocalDate nacimiento;
    @OneToMany(mappedBy = "atleta")
    @JsonIgnore
    private Set<Medallas> medallas = new HashSet<>();

    public Atleta() {
    }

    public Atleta(String nombre, String apellidos, String nacionalidad, LocalDate nacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacionalidad = nacionalidad;
        this.nacimiento = nacimiento;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Set<Medallas> getMedallas() {
        return medallas;
    }

    public void setMedallas(Set<Medallas> medallas) {
        this.medallas = medallas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Atleta atleta = (Atleta) o;

        if (id != atleta.id) return false;
        if (nombre != null ? !nombre.equals(atleta.nombre) : atleta.nombre != null) return false;
        if (apellidos != null ? !apellidos.equals(atleta.apellidos) : atleta.apellidos != null) return false;
        if (nacionalidad != null ? !nacionalidad.equals(atleta.nacionalidad) : atleta.nacionalidad != null)
            return false;
        if (nacimiento != null ? !nacimiento.equals(atleta.nacimiento) : atleta.nacimiento != null) return false;
        return medallas != null ? medallas.equals(atleta.medallas) : atleta.medallas == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (apellidos != null ? apellidos.hashCode() : 0);
        result = 31 * result + (nacionalidad != null ? nacionalidad.hashCode() : 0);
        result = 31 * result + (nacimiento != null ? nacimiento.hashCode() : 0);
        result = 31 * result + (medallas != null ? medallas.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", nacimiento=" + nacimiento +
                '}';
    }
}
