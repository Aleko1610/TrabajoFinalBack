package com.portfolio.anic.Service;

import com.portfolio.anic.Entity.Skills;
import com.portfolio.anic.Repository.RepoSkills;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ServiceSkills {
    @Autowired
     RepoSkills repoSkills;
     
     public List<Skills> list(){
         return repoSkills.findAll();
     }
     
     public Optional<Skills> getOne(int id){
         return repoSkills.findById(id);
     }
     
     public Optional<Skills> getByNombreS(String nombreS){
         return repoSkills.findByNombreS(nombreS);
     }
     
     public void save(Skills skills){
         repoSkills.save(skills);
     }
     
     public void delete(int id){
         repoSkills.deleteById(id);
     }
     
     public boolean existsById(int id){
         return repoSkills.existsById(id);
     }
     
     public boolean existsByNombreS(String nombreS){
         return repoSkills.existsByNombreS(nombreS);
     }
}
