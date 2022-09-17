/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.petlost.petlost.Dao;

import com.petlost.petlost.Models.Usuario;
import java.util.List;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

/**
 *
 * @author jesus
 */
public interface UsuarioDao {
    public List<Usuario> getUsers();
    public String createUser(Usuario user);
    public void deleteUser(Long id);
    public boolean loginUser(Usuario user);

}
