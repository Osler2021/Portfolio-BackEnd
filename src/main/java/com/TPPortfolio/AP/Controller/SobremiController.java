package com.TPPortfolio.AP.Controller;

import com.TPPortfolio.AP.model.Sobremi;
import com.TPPortfolio.AP.services.SobremiService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sobremi")
@CrossOrigin(origins = "*")
public class SobremiController {
    private final SobremiService sobremiService;
    
    public SobremiController (SobremiService sobremiService){
    this.sobremiService =sobremiService;
    }
    
    @GetMapping("/ver")
    public ResponseEntity <List<Sobremi>> obtenerSobremi(){
        List<Sobremi> sobremi = sobremiService.buscarSobremi();
        return new ResponseEntity<>(sobremi, HttpStatus.OK);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/actualizar")
    public ResponseEntity<Sobremi> editarSobremi(@RequestBody Sobremi sobremi) {
        Sobremi updateSobremi = sobremiService.editarSobremi(sobremi);
        return new ResponseEntity<>(updateSobremi, HttpStatus.OK);
    }
    
}
