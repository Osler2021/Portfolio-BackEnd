package com.TPPortfolio.AP.Controller;

import com.TPPortfolio.AP.model.Proyecto;
import com.TPPortfolio.AP.services.ProyectoService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proyectos")
@CrossOrigin(origins = "*")
public class ProyectoController {

    private final ProyectoService proyectoService;

    public ProyectoController(ProyectoService proyectoService) {
        this.proyectoService = proyectoService;
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public ResponseEntity<Proyecto> addProyecto(@RequestBody Proyecto proyecto) {
        Proyecto newProyecto = proyectoService.crearProyectos(proyecto);
        return new ResponseEntity<>(newProyecto, HttpStatus.CREATED);
    }

    @GetMapping("/ver")
    public ResponseEntity<List<Proyecto>> obtenerProyecto() {
        List<Proyecto> proyecto = proyectoService.buscarProyectos();
        return new ResponseEntity<>(proyecto, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/actualizar")
    public ResponseEntity<Proyecto> editarProyecto(@RequestBody Proyecto proyecto) {
        Proyecto updateProyecto = proyectoService.editarProyectos(proyecto);
        return new ResponseEntity<>(updateProyecto, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarProyecto(@PathVariable("id") Long id) {
        proyectoService.borrarProyectos(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
