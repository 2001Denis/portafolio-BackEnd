package com.api.apiportfolio.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExperiencia;
    private String nombre;
    private String porcentaje;

    public Experiencia() {
    }

    public Experiencia(Long idExperiencia, String nombre, String porcentaje) {
        this.idExperiencia = idExperiencia;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }

    public Long getIdExperiencia() {
        return idExperiencia;
    }

    public void setIdExperiencia(Long idExperiencia) {
        this.idExperiencia = idExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }
 
    
  



}