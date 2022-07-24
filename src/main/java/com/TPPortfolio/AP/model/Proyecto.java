package com.TPPortfolio.AP.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Proyecto {
    @Id
    @GeneratedValue (strategy =GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String descripcion;
    private int anodesde;
    private int anofin;
    private String url_imagen;
    private long persona_id;

    public Proyecto() {
    }

    public Proyecto(Long id, String nombre, String descripcion, int anodesde, int anofin, String url_imagen, long persona_id) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.anodesde = anodesde;
        this.anofin = anofin;
        this.url_imagen = url_imagen;
        this.persona_id = persona_id;
        
    }
    
}

