package com.TPPortfolio.AP.services;

import com.TPPortfolio.AP.model.Educacion;
import com.TPPortfolio.AP.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducacionService {
    
    private final EducacionRepository educacionRepo;
    
    @Autowired
    public EducacionService(EducacionRepository educacionRepo){
        this.educacionRepo = educacionRepo;
    }
    
    public Educacion crearEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }
    
    public List<Educacion> buscarEducacion(){
        return educacionRepo.findAll();
    }
    
    public Educacion editarEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }
    
    public void borrarEducacion(Long id){
        educacionRepo.deleteById(id);
    }
    
}