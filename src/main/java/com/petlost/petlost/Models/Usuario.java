package com.petlost.petlost.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jesus
 */
@Entity
@Table(name="usuario")
public class Usuario {
    
    @Id
    @Getter @Setter @Column(name="id_persona")
    private int id_person;
    
    
    @Getter @Setter @Column(name="correo")
    private String email;
    
    
    @Getter @Setter @Column(name="contrasena")
<<<<<<< HEAD
        private int password;
=======
    private int password;
>>>>>>> frontend

    
}
