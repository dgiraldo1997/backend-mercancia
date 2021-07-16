/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgiraldo.mercancia.models.services;

import com.danielgiraldo.mercancia.models.entity.Mercancia;
import java.util.List;

/**
 *
 * @author AdminSainc
 */
public interface IMercanciaService {
    
    public List<Mercancia> findAll();
    
    public Mercancia findById(Long id);
    
    public  Mercancia save(Mercancia mercancia);
    
    public void delete(Long id);
    
    public List<Mercancia> findByNombreContaining(String nombre);
}
