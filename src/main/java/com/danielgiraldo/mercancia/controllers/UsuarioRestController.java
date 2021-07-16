/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgiraldo.mercancia.controllers;

import com.danielgiraldo.mercancia.models.entity.Cargo;
import com.danielgiraldo.mercancia.models.entity.Usuario;
import com.danielgiraldo.mercancia.models.services.IUsuarioService;
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
public class UsuarioRestController {
    
    @Autowired
    IUsuarioService usuarioService;
    
    
    @GetMapping("/usuarios")
    public List<Usuario> index(){
        return usuarioService.findAll();
    }
    
    @GetMapping("/usuarios/{id}")
    public Usuario show(@PathVariable Long id){
        return usuarioService.findById(id);
    }
    
    @PostMapping("/usuarios")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario create(@RequestBody Usuario usuario){
        Cargo cargo = new Cargo();
        cargo.setId(new Long(usuario.getIdcargo().toString()));
        usuario.setCargo(cargo);
        usuario.setCreatedAt(new Date());
        return usuarioService.save(usuario);
    }
    
    @PutMapping("/usuarios/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario update(@RequestBody Usuario usuario,@PathVariable Long id){
        Cargo cargo = new Cargo();
        Usuario usuarioActual=usuarioService.findById(id);
        
        cargo.setId(new Long(usuario.getIdcargo().toString()));
        usuarioActual.setNombre(usuario.getNombre());
        usuarioActual.setApellido(usuario.getApellido());
        usuarioActual.setEdad(usuario.getEdad());
        usuarioActual.setActivo(usuario.getActivo());
        usuarioActual.setCargo(cargo);
        return usuarioService.save(usuarioActual);
    }
    
    @DeleteMapping("/usuarios/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        usuarioService.delete(id);
    }
}
