/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgiraldo.mercancia.models.services;

import com.danielgiraldo.mercancia.models.entity.Cargo;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.danielgiraldo.mercancia.models.repository.ICargoRepository;
/**
 *
 * @author Daniel giraldo
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CargoServiceImplTest {
    
    @Autowired
    private CargoServiceImpl cargoService;
    
    @Mock
    ICargoRepository dao;
    
    @Test
    public void findByIdTest()
    {
        Cargo cargo = new Cargo();
        cargo.setId(1L);
        cargo.setNombre("Administrador");
        
        when(dao.findById(new Long(1))).thenReturn(Optional.of(cargo));
         
        Cargo car = cargoService.findById(1L);
         
        assertEquals("Administrador", car.getNombre());
    }  
    
}
