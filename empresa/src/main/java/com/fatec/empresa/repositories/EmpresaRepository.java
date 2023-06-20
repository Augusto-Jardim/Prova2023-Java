package com.fatec.empresa.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

import com.fatec.empresa.entities.Empresa;
public interface EmpresaRepository extends JpaRepository <Empresa,Integer> {
    
}

