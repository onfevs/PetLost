/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.petlost.petlost.Dao;

import com.petlost.petlost.Models.Persona;
import java.util.List;


/**
 *
 * @author jesus
 */

public interface PersonaDao {
    public List<Persona> getPeople();

    public int createUser(Persona person);

    public void deletePerson(Long id);
}
