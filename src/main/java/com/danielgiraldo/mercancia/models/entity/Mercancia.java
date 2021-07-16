/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgiraldo.mercancia.models.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

/**
 *
 * @author AdminSainc
 */
@Entity
@Data
@Table(name = "mercancia")
public class Mercancia implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private Integer cantidad;
    private Boolean activo;
    
    @ManyToOne
    @JoinColumn(name="usuario_crea", nullable=false)
    private Usuario usuariocrea;
    
    @ManyToOne
    @JoinColumn(name="usuario_edita", nullable=false)
    private Usuario usuarioedita;
    
    private Integer idusuarioCrea;
    private Integer idusuarioEdita;
    
    /*@Column(name = "usuario_crea")
    private Integer usuarioCrea;
    
    @Column(name = "usuario_edita")
    private Integer usuarioEdita;
    */
    @Column(name = "created_at")
    @Temporal(TemporalType.DATE)
    private Date createdAt;
    
    @Column(name = "updated_at")
    @Temporal(TemporalType.DATE)
    private Date updatedAt;
    
    
    @PrePersist
    public void prePersist(){
        createdAt=(new Date());
    }
    private static final long serialVersionUID = 1L;
}
