package com.TPPortfolio.AP.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Sobremi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String descripcion;
    public long persona_id;
    
    //@OneToOne
    //@JoinColumn(name="persona_id")
    //@JsonIgnore
    //private Persona persona;

    public Sobremi() {
    }

    public Sobremi(Long id, String descripcion, long persona_id) {
        this.id = id;
        this.descripcion = descripcion;
        this.persona_id = persona_id;
        
    }

}
