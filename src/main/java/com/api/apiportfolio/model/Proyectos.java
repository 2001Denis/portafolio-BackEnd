package com.api.apiportfolio.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyectos implements Serializable {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idProyectos;
	private String nombre;
	private String comentario;
	private String detalle;
	private String logo;
        private String url;
        private int finalizado;

    public Proyectos() {
    }

    public Proyectos(Long idProyectos, String nombre, String comentario, String detalle, String logo, String url, int finalizado) {
        this.idProyectos = idProyectos;
        this.nombre = nombre;
        this.comentario = comentario;
        this.detalle = detalle;
        this.logo = logo;
        this.url = url;
        this.finalizado = finalizado;
    }

    public Long getIdProyectos() {
        return idProyectos;
    }

    public void setIdProyectos(Long idProyectos) {
        this.idProyectos = idProyectos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(int finalizado) {
        this.finalizado = finalizado;
    }

   

	

}