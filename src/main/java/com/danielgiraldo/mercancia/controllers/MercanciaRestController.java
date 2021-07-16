/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgiraldo.mercancia.controllers;

import com.danielgiraldo.mercancia.models.entity.Mercancia;
import com.danielgiraldo.mercancia.models.entity.Usuario;
import com.danielgiraldo.mercancia.models.services.IMercanciaService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author AdminSainc
 */
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class MercanciaRestController {
    
    @Autowired
    IMercanciaService mercanciaService;
    
    @GetMapping("/mercancias")
    public List<Mercancia> index(){
        return mercanciaService.findAll();
    }
    
    @GetMapping("/mercancias/{id}")
    public Mercancia show(@PathVariable Long id){
        return mercanciaService.findById(id);
    }
    
    @PostMapping("/mercancias")
    @ResponseStatus(HttpStatus.CREATED)
    public Mercancia create(@RequestBody Mercancia mercancia){
        Usuario usuariocrea = new Usuario();
        Usuario usuarioedita = new Usuario();
        usuariocrea.setId(new Long(mercancia.getIdusuarioCrea().toString()));
        usuarioedita.setId(new Long(mercancia.getIdusuarioEdita().toString()));
        mercancia.setUsuariocrea(usuariocrea);
        mercancia.setUsuarioedita(usuarioedita);
        return mercanciaService.save(mercancia);
    }
    
    @PutMapping("/mercancias/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Mercancia update(@PathVariable Long id, @RequestBody Mercancia mercancia){
        Usuario usuarioedita = new Usuario();
        Usuario usuariocrea = new Usuario();
        Mercancia mercanciaActual= mercanciaService.findById(id);
        usuarioedita.setId(new Long(mercancia.getIdusuarioEdita().toString()));
        usuariocrea.setId(new Long(mercancia.getIdusuarioCrea().toString()));
        mercanciaActual.setNombre(mercancia.getNombre());
        mercanciaActual.setCantidad(mercancia.getCantidad());
        mercanciaActual.setActivo(mercancia.getActivo());
        mercanciaActual.setUsuarioedita(usuarioedita);
        mercanciaActual.setUpdatedAt(new Date());
        
        return mercanciaService.save(mercanciaActual);
    }
    
    @DeleteMapping("/mercancias/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        mercanciaService.delete(id);
    }
    
    @GetMapping("/mercancias/buscar/{nombre}")
    public List<Mercancia> findByName(@PathVariable String nombre){
        return mercanciaService.findByNombreContaining(nombre);
    }
}
