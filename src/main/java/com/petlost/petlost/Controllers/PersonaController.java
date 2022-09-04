/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.petlost.petlost.Controllers;

import com.petlost.petlost.Dao.PersonaDao;
import com.petlost.petlost.Models.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jesus
 */
@RestController 
public class PersonaController {
    @Autowired
    private PersonaDao personDao;
    
    @RequestMapping(value="personas/{id}", method=RequestMethod.DELETE)
    public void deletePerson(@PathVariable Long id){
            personDao.deletePerson(id);
    }
    
    @RequestMapping(value="personas", method=RequestMethod.GET)
    public List<Persona> getPeople(){
        return personDao.getPeople();
    }
    
    @RequestMapping(value="personas", method=RequestMethod.POST)
    public void registrarUsuario(@RequestBody Persona person){
        personDao.createUser(person);
    }
}
