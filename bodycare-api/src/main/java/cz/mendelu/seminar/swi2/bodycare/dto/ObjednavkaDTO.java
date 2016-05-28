/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.seminar.swi2.bodycare.dto;
import cz.mendelu.seminar.swi2.bodycare.domain.Zbozi;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author TJ
 */
public class ObjednavkaDTO {
    
    private int id;
    
    private List<Zbozi> seznamZbozi;
    
    private ZakaznikDTO zakaznik;    
   
    public int getId() {
        return id;
    }
 
    public List<Zbozi> getZbozi(){
        return seznamZbozi;
    }    
    
    public ZakaznikDTO getZakaznik(){
        return zakaznik;
    }    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.zakaznik);
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
