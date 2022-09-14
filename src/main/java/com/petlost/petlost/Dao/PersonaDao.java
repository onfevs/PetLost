/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.petlost.petlost.Dao;

import com.petlost.petlost.Models.Contacto;
import com.petlost.petlost.Models.Persona;
import com.petlost.petlost.Models.Usuario;
import java.util.List;


/**
 *
 * @author jesus
 */

public interface PersonaDao {
    public List<Persona> getPeople();

    public int createUser(Persona person);

    public void deletePerson(Long id);
    
    public List<Persona> storageUserSession(Usuario user);
    
    public List<Contacto> storageContactSession(Usuario user);
    
    public Persona updatePerson(Persona person, Long id);
}
