package com.api.apiportfolio.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String correo;
    private String celular;
    private String ciudad;
    private String nacimiento;
    private String ocupacion;
    private String disponibilidad;
    private String habilidades;

    public Persona() {
    }

    public Persona(Long id, String correo, String celular, String ciudad, String nacimiento, String ocupacion, String disponibilidad, String habilidades) {
        this.id = id;
        this.correo = correo;
        this.celular = celular;
        this.ciudad = ciudad;
        this.nacimiento = nacimiento;
        this.ocupacion = ocupacion;
        this.disponibilidad = disponibilidad;
        this.habilidades = habilidades;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }
    
    
    
  


}