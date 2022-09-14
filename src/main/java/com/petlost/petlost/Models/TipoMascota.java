/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.petlost.petlost.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author jesus
 */

@Entity
@Table(name="tipomascota")
public class TipoMascota {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Setter @Getter @Column(name="id")
    private int id;
    
    @Setter @Getter @Column(name="descripcion")
    private String description;
    
}
