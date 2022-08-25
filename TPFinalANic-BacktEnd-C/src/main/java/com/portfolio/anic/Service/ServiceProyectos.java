/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.anic.Service;

import com.portfolio.anic.Entity.Proyectos;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.anic.Repository.RepoProyectos;

@Service
@Transactional
public class ServiceProyectos {
    @Autowired
    RepoProyectos repoProyectos;
    
    public List<Proyectos> list(){
        return repoProyectos.findAll();
    }
    
    public Optional<Proyectos> getOne(int id){
        return repoProyectos.findById(id);
    }
    
    public Optional<Proyectos> getByNombreP(String nombreP){
        return repoProyectos.findByNombreP(nombreP);
    }
    
    public void save(Proyectos proyectos){
        repoProyectos.save(proyectos);
    }
    
    public void delete(int id){
        repoProyectos.deleteById(id);
    }
    
    public boolean existsById(int id){
        return repoProyectos.existsById(id);
    }
    
    public boolean existsByNombreP(String nombreP){
        return repoProyectos.existsByNombreP(nombreP);
    }
}
