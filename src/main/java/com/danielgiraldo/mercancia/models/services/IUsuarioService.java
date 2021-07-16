/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgiraldo.mercancia.models.services;

import com.danielgiraldo.mercancia.models.entity.Usuario;
import java.util.List;

/**
 *
 * @author AdminSainc
 */
public interface IUsuarioService {
    
    public List<Usuario> findAll();
    
    public Usuario findById(Long id);
    
    public Usuario save( Usuario usuario);
    
    public void delete(Long id);
}
