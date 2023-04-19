package com.api.apiportfolio.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEducacion;
    private String titulo;
    private String detalle;
    private int finalizado;
    private String url_1;
    private String url_2;
    private String detalle_1;
    private String detalle_2;

    public Educacion() {
    }

    public Educacion(Long idEducacion, String titulo, String detalle, int finalizado, String url_1, String url_2, String detalle_1, String detalle_2) {
        this.idEducacion = idEducacion;
        this.titulo = titulo;
        this.detalle = detalle;
        this.finalizado = finalizado;
        this.url_1 = url_1;
        this.url_2 = url_2;
        this.detalle_1 = detalle_1;
        this.detalle_2 = detalle_2;
    }

    public Long getIdEducacion() {
        return idEducacion;
    }

    public void setIdEducacion(Long idEducacion) {
        this.idEducacion = idEducacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(int finalizado) {
        this.finalizado = finalizado;
    }

    public String getUrl_1() {
        return url_1;
    }

    public void setUrl_1(String url_1) {
        this.url_1 = url_1;
    }

    public String getUrl_2() {
        return url_2;
    }

    public void setUrl_2(String url_2) {
        this.url_2 = url_2;
    }

    public String getDetalle_1() {
        return detalle_1;
    }

    public void setDetalle_1(String detalle_1) {
        this.detalle_1 = detalle_1;
    }

    public String getDetalle_2() {
        return detalle_2;
    }

    public void setDetalle_2(String detalle_2) {
        this.detalle_2 = detalle_2;
    }

    
    
}
