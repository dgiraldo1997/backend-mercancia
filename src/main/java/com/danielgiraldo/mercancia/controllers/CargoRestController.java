/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgiraldo.mercancia.controllers;

import com.danielgiraldo.mercancia.models.entity.Cargo;
import com.danielgiraldo.mercancia.models.services.ICargoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
public class CargoRestController {
    
    @Autowired
    private ICargoService cargoServise;
    
    @GetMapping("/cargos")
    public ResponseEntity<List<Cargo>> index(){
        return ResponseEntity.ok(cargoServise.findAll());
    }
    
    @GetMapping("/cargos/{id}")
    public ResponseEntity<Cargo> show(@PathVariable Long id){
       return ResponseEntity.ok(cargoServise.findById(id));
    }
    
    @PostMapping("/cargos")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Cargo> create(@RequestBody Cargo cargo){
        return ResponseEntity.ok(cargoServise.save(cargo));
    }
    
    @PutMapping("/cargos/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Cargo> update(@RequestBody Cargo cargo, @PathVariable Long id){
        Cargo cargoActual= cargoServise.findById(id);
        cargoActual.setNombre(cargo.getNombre());
        return ResponseEntity.ok(cargoServise.save(cargoActual));
    }
    
    @DeleteMapping("/cargos/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<?> delete(@PathVariable Long id){
        try{
            cargoServise.delete(id);
            return ResponseEntity.ok().build();
        }catch(Exception e){
            return ResponseEntity.badRequest().build();
        }
    }
    
    
    
}
