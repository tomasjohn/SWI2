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
public class ZboziDTO {
    
    private int id;

    private int cena;
    
    private int dan;
    
    private String nazev;
    
    private String znacka;        
        
    public int getId(){
        return id;
    }
    public int getCena(){
        return cena;
    }
    public int getDan(){
        return dan;
    }   

    public String getNazev(){
        return nazev;
    }  
    public String getZnacka(){
        return znacka;
    }
   
    @Override
    public boolean equals(Object obj) {
    
        //TODO?
        
        return true;
    }
}
