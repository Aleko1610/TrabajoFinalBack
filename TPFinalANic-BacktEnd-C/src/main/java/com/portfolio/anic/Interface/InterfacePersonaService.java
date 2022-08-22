package com.portfolio.anic.Interface;

import com.portfolio.anic.Entity.Persona;
import java.util.List;

public interface InterfacePersonaService {
    //Traer una lista de personas
    public List <Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    public void savePersona (Persona persona);
    
    //Eliminar un objeto pero lo buscamos por id
    public void deletePersona (Long id);
    
    //Buscar una persona por ID
    public Persona findPersona (Long id);
}
