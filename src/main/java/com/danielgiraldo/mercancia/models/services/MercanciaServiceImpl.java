/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgiraldo.mercancia.models.services;

import com.danielgiraldo.mercancia.models.entity.Mercancia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.danielgiraldo.mercancia.models.repository.IMercanciaRepository;

/**
 *
 * @author AdminSainc
 */

@Service
public class MercanciaServiceImpl implements IMercanciaService{

    @Autowired 
    private IMercanciaRepository mercanciaRepository;
    
    
    @Override
    @Transactional(readOnly = true)
    public List<Mercancia> findAll() {
        return (List<Mercancia>) mercanciaRepository.findAll();
                
    }

    @Override
    @Transactional(readOnly = true)
    public Mercancia findById(Long id) {
        return mercanciaRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Mercancia save(Mercancia mercancia) {
        return mercanciaRepository.save(mercancia);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        mercanciaRepository.deleteById(id);
    }

    @Override
    public List<Mercancia> findByNombreContaining(String nombre) {
        return mercanciaRepository.findByNombreContaining(nombre);
    }
    
    
}
