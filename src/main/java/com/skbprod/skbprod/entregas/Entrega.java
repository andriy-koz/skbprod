package com.skbprod.skbprod.entregas;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="entregas")
public class Entrega {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   @Column(name = "hora")
   @CreatedDate
   @Temporal(TemporalType.TIMESTAMP)
   private Date hora;

   @Column(name = "cantidad")
   private Integer cantidad;

   @Column(name = "pieza")
   private String pieza;

   @Column(name = "modelo")
   private String modelo;

   public Long getId() {
       return this.id;
   }
   public void setId(Long id) {
      this.id = id;
   }

   public Date getHora() {
       return this.hora;
   }
   public void setHora(Date hora) {
       this.hora = hora;
   }

   public Integer getCantidad() {
       return this.cantidad;
   }
   public void setCantidad(Integer cantidad) {
       this.cantidad = cantidad;
   }

   public String getPieza() {
       return this.pieza;
   }
   public void setPieza(String pieza) {
       this.pieza = pieza;
   }

   public String getModelo() {
       return this.modelo;
   }
   public void setModelo(String modelo) {
       this.modelo = modelo;
   }
}
