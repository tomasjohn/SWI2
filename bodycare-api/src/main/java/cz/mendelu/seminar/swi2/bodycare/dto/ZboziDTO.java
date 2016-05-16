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
       return this.id;
   }
   public int getCena(){
       return this.cena;
   }
   public int getDan(){
       return this.dan;
   }   
   
   public String getNazev(){
       return this.nazev;
   }  
   public String getZnacka(){
       return this.znacka;
   }
}
