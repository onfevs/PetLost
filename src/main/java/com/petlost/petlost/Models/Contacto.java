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
@Table(name="contacto")
public class Contacto {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name="id")
    private int id;
    
    @Getter @Setter @Column(name="direccion")
    private String address;
    
    @Getter @Setter @Column(name="celular")
    private long phone;
    
    @Getter @Setter @Column(name="id_persona")
    private int id_person;
    
    @Getter @Setter @Column(name="ciudad")
    private String city;
    
}
