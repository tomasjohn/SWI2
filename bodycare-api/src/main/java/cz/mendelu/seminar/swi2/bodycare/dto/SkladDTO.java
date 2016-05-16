/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.seminar.swi2.bodycare.dto;

import cz.mendelu.seminar.swi2.bodycare.domain.Zbozi;
import java.util.Set;

/**
 *
 * @author TJ
 */
public class SkladDTO {
    
    
    private int id;
    
    private String nazev;
    
    private Set<Zbozi> zbozi;
    
    
    public int getId(){
        return id;
    }
    
    public String getNazev(){
        return nazev;
    }
    
    public Set<Zbozi> getZbozi(){
        return zbozi;
    }
    
    @Override
    public boolean equals(Object obj) {
    
        //TODO?
        
        return true;
    }
}
