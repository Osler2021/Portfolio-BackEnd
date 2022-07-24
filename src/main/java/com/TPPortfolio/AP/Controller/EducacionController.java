package com.TPPortfolio.AP.Controller;

import com.TPPortfolio.AP.model.Educacion;
import com.TPPortfolio.AP.services.EducacionService;
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
@RequestMapping("/educacion")
@CrossOrigin(origins = "*")
public class EducacionController {
    private final EducacionService educacionService;
    
   
    public EducacionController(EducacionService educacionService){
        this.educacionService = educacionService;
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/new")
    public ResponseEntity <Educacion> crearEducacion (@RequestBody Educacion educacion){
        Educacion newEducacion=educacionService.crearEducacion(educacion);
        return new ResponseEntity<>(newEducacion,HttpStatus.CREATED);
    }
    @GetMapping("/ver")
    public ResponseEntity <List<Educacion>> obtenerEducacion(){
        List<Educacion> educaciones = educacionService.buscarEducacion();
        return new ResponseEntity<>(educaciones, HttpStatus.OK);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/actualizar")
    public ResponseEntity<Educacion> editarEducacion(@RequestBody Educacion educacion){
        Educacion updateEducacion=educacionService.editarEducacion(educacion);
        return new ResponseEntity<>(updateEducacion,HttpStatus.OK);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
          public ResponseEntity<?> borrarEducacion(@PathVariable ("id") Long id){
              educacionService.borrarEducacion(id);
              return new ResponseEntity<>(HttpStatus.OK);
          }
}
