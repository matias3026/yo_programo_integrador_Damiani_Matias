/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.med.Interface;

import com.portfolio.med.Entty.Persona;
import java.util.List;


/**
 *
 * @author matia
 */
public interface IPersonaService {
    //traer lista de personas
    public List<Persona> getPersona();
    
    
    //Guardar objeto tipo persona
    public void savePersona(Persona persona);
    
    
    //eliminar objeto pero lo buscamos por id
    public void deletePersona(Long id);
    
    //Budscar una persona p0r id
    public Persona findPersona(Long id);
    
    
}
