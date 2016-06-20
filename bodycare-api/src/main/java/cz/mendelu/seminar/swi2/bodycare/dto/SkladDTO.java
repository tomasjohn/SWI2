/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.seminar.swi2.bodycare.dto;

import java.util.List;

/**
 *
 * @author TJ
 */
public class SkladDTO {
    
    
    private int id;
    
    private String nazev;
    
    private List<ZboziDTO> zbozi;
    
    
    public int getId(){
        return id;
    }
    
    public String getNazev(){
        return nazev;
    }
    
    public List<ZboziDTO> getZbozi(){
        return zbozi;
    }

    public void setId(int id) {
	this.id = id;
    }

    public void setNazev(String nazev) {
	this.nazev = nazev;
    }

    public void setZbozi(List<ZboziDTO> zbozi) {
	this.zbozi = zbozi;
    }
    
    @Override
    public boolean equals(Object obj) {
    
        //TODO?
        
        return true;
    }
}
