/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.seminar.swi2.bodycare.service;

import cz.mendelu.seminar.swi2.bodycare.domain.Zakaznik;

import java.util.List;

/**
 *
 * @author XSTRATI6
 */
public interface ZakaznikService {

    void createSklad(Zakaznik zakaznik);

    Zakaznik findById(int id);

    List<Zakaznik> findAll();

    void delete(Zakaznik zakaznik);
}
