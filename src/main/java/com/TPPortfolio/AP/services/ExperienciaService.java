package com.TPPortfolio.AP.services;

import com.TPPortfolio.AP.model.Experiencia;
import com.TPPortfolio.AP.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperienciaService {
    private final ExperienciaRepository experienciaRepo;
    
    @Autowired
    public ExperienciaService(ExperienciaRepository experienciaRepo){
        this.experienciaRepo = experienciaRepo;
    }
    
        public Experiencia crearExperiencia(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }
    
    public List<Experiencia> buscarExperiencia(){
        return experienciaRepo.findAll();
    }
    
    public Experiencia editarExperiencia(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }
    
    public void borrarExperiencia(Long id){
        experienciaRepo.deleteById(id);
    }
    
}