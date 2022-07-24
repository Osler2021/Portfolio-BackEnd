package com.TPPortfolio.AP.repository;

import com.TPPortfolio.AP.model.Sobremi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SobremiRepository extends JpaRepository <Sobremi, Long>{
    
}
