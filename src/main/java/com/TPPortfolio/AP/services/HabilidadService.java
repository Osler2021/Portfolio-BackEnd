package com.TPPortfolio.AP.services;

import com.TPPortfolio.AP.model.Habilidad;
import com.TPPortfolio.AP.repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class HabilidadService {
    private final HabilidadRepository habilRepo;
    
    @Autowired
    public HabilidadService(HabilidadRepository habilRepo){
        this.habilRepo = habilRepo;
    }
    
        public Habilidad crearHabilidad(Habilidad habilidad){
        return habilRepo.save(habilidad);
    }
    
    public List<Habilidad> buscarHabilidad(){
        return habilRepo.findAll();
    }
    
    public Habilidad editarHabilidad(Habilidad habilidad){
        return habilRepo.save(habilidad);
    }
    
    public void borrarHabilidad(Long id){
        habilRepo.deleteById(id);
    }
    

    
}
