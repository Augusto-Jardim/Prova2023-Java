package com.fatec.empresa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fatec.empresa.entities.Empresa;
import com.fatec.empresa.repositories.EmpresaRepository;
import jakarta.persistence.EntityNotFoundException;

import com.fatec.empresa.entities.Empresa;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    public Empresa getEmpresaById(int id){
        return empresaRepository.findById(id).orElseThrow(
            () -> new EntityNotFoundException("Empresa não encontrado")
        );
    }

    public List<Empresa> getEmpresas(){
        return empresaRepository.findAll();
    }

    public Empresa save(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    public void deleteById(int id) {
        Empresa empresa = getEmpresaById(id);
        empresaRepository.delete(empresa);
    }
    
}
