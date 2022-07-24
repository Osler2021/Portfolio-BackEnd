package com.TPPortfolio.AP.security.repository;

import com.TPPortfolio.AP.security.model.Rol;
import com.TPPortfolio.AP.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
