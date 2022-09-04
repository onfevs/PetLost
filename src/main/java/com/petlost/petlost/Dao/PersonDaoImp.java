/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.petlost.petlost.Dao;

import com.petlost.petlost.Models.Persona;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jesus
 */
@Repository
//@Transactional
public class PersonDaoImp implements PersonaDao{
    @PersistenceContext
    EntityManager entityManager;
    
    @Override
    public void createUser(Persona person){
        entityManager.merge(person);
    }

    @Override
    @Transactional
    public List<Persona> getPeople() {
        String query = "FROM Persona";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    @Transactional
    public void deletePerson(Long id) {
        try{
        Persona person = entityManager.find(Persona.class, id.intValue());
        entityManager.remove(person);    
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
