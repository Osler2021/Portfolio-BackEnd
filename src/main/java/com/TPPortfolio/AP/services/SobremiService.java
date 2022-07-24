package com.TPPortfolio.AP.services;

import com.TPPortfolio.AP.model.Sobremi;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.TPPortfolio.AP.repository.SobremiRepository;

@Service
@Transactional
public class SobremiService {

    private final SobremiRepository sobremiRepo;

    @Autowired
    public SobremiService(SobremiRepository sobremiRepo) {
        this.sobremiRepo = sobremiRepo;
    }

    public Sobremi crearSobremi(Sobremi sobremi) {
        return sobremiRepo.save(sobremi);
    }

    public List<Sobremi> buscarSobremi() {
        return sobremiRepo.findAll();
    }

    public Sobremi editarSobremi(Sobremi sobremi) {
        return sobremiRepo.save(sobremi);
    }

}

