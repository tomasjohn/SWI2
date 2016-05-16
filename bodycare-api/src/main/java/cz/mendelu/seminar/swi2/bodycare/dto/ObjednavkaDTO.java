/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.seminar.swi2.bodycare.dto;
import cz.mendelu.seminar.swi2.bodycare.domain.Zbozi;

import java.util.Objects;
import java.util.List;

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
        return this.seznamZbozi;
    }    
    
    public ZakaznikDTO getZakaznik(){
        return this.zakaznik;
    }    
    
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
