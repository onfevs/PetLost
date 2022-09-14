/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.petlost.petlost.Dao;

import com.petlost.petlost.Models.Contacto;
import java.util.List;

/**
 *
 * @author jesus
 */
public interface ContactoDao {
    public List<Contacto> getContact();
    
    public void createContact(Contacto contact);
}
