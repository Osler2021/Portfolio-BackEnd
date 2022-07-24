package com.TPPortfolio.AP.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String url_logo;
    private String nombreempresa;
    private String url_empresa;
    private int estrabajoactual;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechainicio;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechafin;
    private String titulopuesto;
    private String descripcion;
    private long persona_id;
    
    public Experiencia() {}

    public Experiencia(Long id, String url_logo, String nombreempresa, String url_empresa,int estrabajoactual, Date fechainicio, Date fechafin, String titulopuesto, String descripcion, long persona_id) {
        this.id = id;
        this.url_logo = url_logo;
        this.nombreempresa = nombreempresa;
        this.url_empresa = url_empresa;
        this.estrabajoactual = estrabajoactual;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.titulopuesto = titulopuesto;
        this.descripcion = descripcion;
        this.persona_id = persona_id;
    }

}