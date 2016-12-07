package com.example.domain;

import javax.persistence.*;

@Entity
public class Medallas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Enumerated(EnumType.STRING)
    private TipoMedallas tipoMedallas;
    private String especialidad;
    private String competicion;
    @ManyToOne
    private Atleta atleta;

    public Medallas() {
    }

    public Medallas(TipoMedallas tipoMedallas, String especialidad, String competicion) {
        this.tipoMedallas = tipoMedallas;
        this.especialidad = especialidad;
        this.competicion = competicion;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoMedallas getTipoMedallas() {
        return tipoMedallas;
    }

    public void setTipoMedallas(TipoMedallas tipoMedallas) {
        this.tipoMedallas = tipoMedallas;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCompeticion() {
        return competicion;
    }

    public void setCompeticion(String competicion) {
        this.competicion = competicion;
    }

    public Atleta getAtleta() {
        return atleta;
    }

    public void setAtleta(Atleta atleta) {
        this.atleta = atleta;
    }

    @Override
    public String toString() {
        return "Medallas{" +
                "id=" + id +
                ", especialidad='" + especialidad + '\'' +
                ", competicion='" + competicion + '\'' +
                ", atleta=" + atleta +
                '}';
    }
}
