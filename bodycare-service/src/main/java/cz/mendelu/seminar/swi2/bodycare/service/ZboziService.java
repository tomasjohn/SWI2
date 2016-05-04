/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.seminar.swi2.bodycare.service;

import cz.mendelu.seminar.swi2.bodycare.domain.Zbozi;

import java.util.List;

/**
 *
 * @author XSTRATI6
 */
public interface ZboziService {

    void create(Zbozi zbozi);

    Zbozi findById(int id);

    List<Zbozi> findByNazev(String nazev);

    List<Zbozi> findByZnacka(String znacka);

    List<Zbozi> findAll();

    void delete(Zbozi zbozi);
}
