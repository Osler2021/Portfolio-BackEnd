package com.TPPortfolio.AP.services;

import com.TPPortfolio.AP.model.Proyecto;
import com.TPPortfolio.AP.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProyectoService {

    private final ProyectoRepository proyectosRepo;

    @Autowired
    public ProyectoService(ProyectoRepository proyectosRepo) {
        this.proyectosRepo = proyectosRepo;
    }

    public Proyecto crearProyectos(Proyecto proyecto) {
        return proyectosRepo.save(proyecto);
    }

    public List<Proyecto> buscarProyectos() {
        return proyectosRepo.findAll();
    }

    public Proyecto editarProyectos(Proyecto proyecto) {
        return proyectosRepo.save(proyecto);
    }

    public void borrarProyectos(Long id) {
        proyectosRepo.deleteById(id);
    }
}
