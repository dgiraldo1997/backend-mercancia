/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgiraldo.mercancia.models.services;

import com.danielgiraldo.mercancia.models.entity.Cargo;
import java.util.List;

/**
 *
 * @author AdminSainc
 */
public interface ICargoService {
    
    public List<Cargo> findAll();
    
    public Cargo findById(Long id);
    
    public Cargo save(Cargo cargo);
    
    public void delete(Long id);
}
