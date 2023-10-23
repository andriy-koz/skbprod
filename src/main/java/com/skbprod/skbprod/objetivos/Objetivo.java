package com.skbprod.skbprod.objetivos;

import jakarta.persistence.*;

@Entity
public class Objetivo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "hora_inicio")
    private String horaInicio;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "pieza")
    private String pieza;

    @Column(name = "cantidad_objetivo")
    private Integer cantidadObjetivo;

    @Column(name = "tiempo_estimado")
    private Integer tiempoEstimado;

    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getHoraInicio() {
        return this.horaInicio;
    }
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPieza() {
        return this.pieza;
    }
    public void setPieza(String pieza) {
        this.pieza = pieza;
    }

    public Integer getCantidadObjetivo() {
        return this.cantidadObjetivo;
    }
    public void setCantidadObjetivo(Integer cantidadObjetivo) {
        this.cantidadObjetivo = cantidadObjetivo;
    }

    public Integer getTiempoEstimado() {
        return this.tiempoEstimado;
    }
    public void setTiempoEstimado(Integer tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }
}
