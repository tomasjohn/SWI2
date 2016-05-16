/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.seminar.swi2.bodycare.service;

import cz.mendelu.seminar.swi2.bodycare.domain.Objednavka;
import cz.mendelu.seminar.swi2.bodycare.domain.Zakaznik;
import cz.mendelu.seminar.swi2.bodycare.domain.Zbozi;


import java.util.List;

/**
 *
 * @author XSTRATI6
 */
public interface ObjednavkaService {

    void create(Objednavka objednavka);

    Objednavka findById(int id);

    List<Objednavka> findAll();
    
    void delete(Objednavka objednavka);

    List<Objednavka> getAllObjednavkaByZakaznik(Zakaznik zakaznik);

}
