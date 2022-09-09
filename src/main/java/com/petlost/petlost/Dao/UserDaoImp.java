/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.petlost.petlost.Dao;

import com.petlost.petlost.Models.Usuario;
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
@Transactional
public class UserDaoImp implements UsuarioDao {
    @PersistenceContext
    EntityManager entityManager;
    
    @Override
    public List<Usuario> getUsers() {
        List<Usuario> users = null;
        String sql = "FROM Usuario";
        try{
            users = entityManager.createQuery(sql).getResultList();
        }catch(Exception e){
            e.printStackTrace();
        }
        return users;
    }

    @Override
    @Transactional
    public void createUser(Usuario user) {
        try{
            entityManager.merge(user);
        }catch(Exception e){
            e.printStackTrace();
        }
<<<<<<< HEAD
=======
        

>>>>>>> frontend
    }

    @Override
    public void deleteUser(Long id) {
        
    }
<<<<<<< HEAD

    @Override
    public boolean loginUser(Usuario user) {
        String query = "FROM Usuario WHERE email = :email AND password = :password";
        List<Usuario> answer = entityManager.createQuery(query)
                .setParameter("email", user.getEmail())
                .setParameter("password", user.getPassword())
                .getResultList();
        return !answer.isEmpty();
    }
=======
>>>>>>> frontend
    
}
