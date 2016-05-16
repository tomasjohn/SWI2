/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.seminar.swi2.bodycare.dto;

/**
 *
 * @author TJ
 */
public class ZakaznikDTO {
    
    private int id;
    
    private int sleva;
    
    private String jmeno;
    
    private String adresa;
    
    
    public String getJmeno(){
        return jmeno;
    }
    public String getAdresa(){
        return adresa;
    }
    
    public int getSleva(){
        return sleva;
    }
    
    public int getId(){
        return id;
    }    
    
    @Override
    public boolean equals(Object obj) {
    
        //TODO?
        
        return true;
    }
    
}
