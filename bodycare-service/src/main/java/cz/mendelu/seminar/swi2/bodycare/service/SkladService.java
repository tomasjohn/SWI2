/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.seminar.swi2.bodycare.service;

import cz.mendelu.seminar.swi2.bodycare.domain.Sklad;
import cz.mendelu.seminar.swi2.bodycare.domain.Zbozi;

import java.util.List;

/**
 *
 * @author XSTRATI6
 */
public interface SkladService {

    void create(Sklad sklad);

    Sklad findById(int id);

    List<Sklad> findAll();

    void delete(Sklad sklad);
}
