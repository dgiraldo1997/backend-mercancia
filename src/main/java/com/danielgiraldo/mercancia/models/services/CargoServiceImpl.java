/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgiraldo.mercancia.models.services;

import com.danielgiraldo.mercancia.models.entity.Cargo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.danielgiraldo.mercancia.models.repository.ICargoRepository;

/**
 *
 * @author AdminSainc
 */
@Service
public class CargoServiceImpl implements ICargoService{

    @Autowired
    private ICargoRepository cargoRepository;
    
    @Override
    @Transactional(readOnly = true)
    public List<Cargo> findAll() {
        return (List<Cargo>) cargoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Cargo findById(Long id) {
        return cargoRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Cargo save(Cargo cargo) {
        return cargoRepository.save(cargo);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        cargoRepository.deleteById(id);
    }
    
}
