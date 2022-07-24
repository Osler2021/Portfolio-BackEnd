package com.TPPortfolio.AP.Controller;

import com.TPPortfolio.AP.model.Habilidad;
import com.TPPortfolio.AP.services.HabilidadService;
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
@RequestMapping("/habilidad")
@CrossOrigin(origins = "*")
public class HabilidadController {

    private final HabilidadService habilidadService;

    public HabilidadController(HabilidadService habilidadService) {
        this.habilidadService = habilidadService;
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public ResponseEntity<Habilidad> crearHabilidad(@RequestBody Habilidad habilidad) {
        Habilidad newHabilidad = habilidadService.crearHabilidad(habilidad);
        return new ResponseEntity<>(newHabilidad, HttpStatus.CREATED);
    }

    @GetMapping("/ver")
    public ResponseEntity<List<Habilidad>> obtenerHabilidad() {
        List<Habilidad> habilidad = habilidadService.buscarHabilidad();
        return new ResponseEntity<>(habilidad, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/actualizar")
    public ResponseEntity<Habilidad> editarHabilidad(@RequestBody Habilidad habilidad) {
        Habilidad updateHabilidad = habilidadService.editarHabilidad(habilidad);
        return new ResponseEntity<>(updateHabilidad, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarHabilidad(@PathVariable("id") Long id) {
        habilidadService.borrarHabilidad(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
