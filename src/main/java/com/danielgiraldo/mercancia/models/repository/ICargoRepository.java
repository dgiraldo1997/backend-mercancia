/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgiraldo.mercancia.models.repository;

import com.danielgiraldo.mercancia.models.entity.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author AdminSainc
 */
public interface ICargoRepository extends JpaRepository<Cargo, Long>{
    
}
