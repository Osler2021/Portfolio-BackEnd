package com.TPPortfolio.AP.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreinstitucion;
    private String url_logo;
    private String titulo;
    private int anodesde;
    private int anohasta;
    private long persona_id;    
      
    public Educacion() {
    }
    
        public Educacion (Long id, String nombreinstitucion, String url_logo, String titulo, int anodesde, int anohasta, long persona_id) {
        this.id = id;
        this.nombreinstitucion = nombreinstitucion;
        this.url_logo = url_logo;
        this.titulo = titulo;
        this.anodesde = anodesde;
        this.anohasta = anohasta;
        this.persona_id = persona_id;
        
                
    }

}