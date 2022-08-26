/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.anic.Service;

import com.portfolio.anic.Entity.Educacion;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.anic.Repository.RepoEducacion;

@Service
@Transactional
public class ServiceEducacion {
    @Autowired
    RepoEducacion repoEducacion;
    
    public List<Educacion> list(){
        return repoEducacion.findAll();
    }
    
    public Optional<Educacion> getOne(int id){
        return repoEducacion.findById(id);
    }
    
    public Optional<Educacion> getByNmbreE(String nombreE){
        return repoEducacion.findByNombreE(nombreE);
    }
    
    public void save(Educacion educacion){
        repoEducacion.save(educacion);
    }
    
    public void delete(int id){
        repoEducacion.deleteById(id);
    }
    
    public boolean existsById(int id){
        return repoEducacion.existsById(id);
    }
    
    public boolean existsByNombreE(String nombreE){
        return repoEducacion.existsByNombreE(nombreE);
    }
}
