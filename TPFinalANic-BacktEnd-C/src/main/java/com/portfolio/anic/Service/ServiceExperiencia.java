/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.anic.Service;

import com.portfolio.anic.Entity.Experiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.anic.Repository.RepoExperiencia;

@Service
@Transactional
public class ServiceExperiencia {
     @Autowired
     RepoExperiencia repoExperiencia;
     
     public List<Experiencia> list(){
         return repoExperiencia.findAll();
     }
     
     public Optional<Experiencia> getOne(int id){
         return repoExperiencia.findById(id);
     }
     
     public Optional<Experiencia> getByNombreE(String nombreE){
         return repoExperiencia.findByNombreE(nombreE);
     }
     
     public void save(Experiencia expe){
         repoExperiencia.save(expe);
     }
     
     public void delete(int id){
         repoExperiencia.deleteById(id);
     }
     
     public boolean existsById(int id){
         return repoExperiencia.existsById(id);
     }
     
     public boolean existsByNombreE(String nombreE){
         return repoExperiencia.existsByNombreE(nombreE);
     }
}
