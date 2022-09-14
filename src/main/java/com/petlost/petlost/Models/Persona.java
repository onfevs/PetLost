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
@Table(name="persona")
public class Persona {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name="id")
    private int idPerson;
    
    @Getter @Setter @Column(name="nombres")
    private String names;
    
    @Getter @Setter @Column(name="apellidos")
    private String lastnames;
    
}
