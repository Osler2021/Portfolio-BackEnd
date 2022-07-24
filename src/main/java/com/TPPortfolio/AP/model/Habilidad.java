package com.TPPortfolio.AP.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private int porcentaje;
    private long persona_id;

    public Habilidad() {
    }

    public Habilidad(Long id, String nombre, int porcentaje, long persona_id) {
        this.id = id;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.persona_id = persona_id;
    }

}
