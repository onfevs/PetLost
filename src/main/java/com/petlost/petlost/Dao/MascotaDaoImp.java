/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.petlost.petlost.Dao;

import com.petlost.petlost.Models.Mascota;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jesus
 */
@Repository
public class MascotaDaoImp implements MascotaDao{
    @PersistenceContext
    EntityManager entityManager;
    
    @Override
    public List<Mascota> getPet() {
        String query = "FROM Mascota";
        return entityManager.createQuery(query).getResultList();
    }
    
}
