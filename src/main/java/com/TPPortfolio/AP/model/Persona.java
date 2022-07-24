package com.TPPortfolio.AP.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String domicilio;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechanac;
    private String telefono;
    private String correo;
    private String titulo;
    private String sobre_mi;
    private String url_foto;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    public List<Sobremi> acercaDeList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    public List<Educacion> educacionList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    public List<Habilidad> habilidadList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    public List<Experiencia> experienciaList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    public List<Proyecto> proyectoList;
    
    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String domicilio, Date fechanac, String telefono, String correo, String titulo, String sobre_mi, String url_foto) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.fechanac = fechanac;
        this.telefono = telefono;
        this.correo = correo;
        this.titulo = titulo;
        this.sobre_mi = sobre_mi;
        this.url_foto = url_foto;
    }
 
}