/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.petlost.petlost.Controllers;

import com.petlost.petlost.Dao.MascotaDao;
import com.petlost.petlost.Models.Mascota;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jesus
 */
@RestController
public class MascotaController {
    @Autowired
    MascotaDao mascotaDao;
    
    @RequestMapping(value="mascota")
    public List<Mascota> getPet(){
        return mascotaDao.getPet();
    }
    
    @RequestMapping(value="mascota", method=RequestMethod.POST)
    public void createPet(@RequestBody Mascota pet){
        mascotaDao.createPet(pet);
    }
}
