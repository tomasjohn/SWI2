/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.seminar.swi2.bodycare.service;

import cz.mendelu.seminar.swi2.bodycare.dao.ObjednavkaDao;
import cz.mendelu.seminar.swi2.bodycare.domain.Objednavka;
import cz.mendelu.seminar.swi2.bodycare.domain.Zakaznik;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author XSTRATI6
 */
public class ObjednavkaServiceImpl implements ObjednavkaService {

    @Inject
    private ObjednavkaDao objednavkaDao;

    @Override
    public void createObjednavka(Objednavka objednavka) {
        objednavkaDao.save(objednavka);
    }

    @Override
    public Objednavka findById(int id) {
        return objednavkaDao.findById(id);
    }

    @Override
    public List<Objednavka> findAll() {
        return objednavkaDao.findAll();
    }

    @Override
    public void delete(Objednavka objednavka) {
        objednavkaDao.delete(objednavka);
    }

    @Override
    public List<Objednavka> getAllObjednavkaByZakaznik(Zakaznik zakaznik) {
        if (zakaznik == null) {
            throw new NullPointerException("Zakaznik is null.");
        }

        List<Objednavka> objednavkas = objednavkaDao.findAll();
        if (objednavkas.isEmpty() || objednavkas == null) {
            throw new NullPointerException("List of Objednavkas is empty or null.");
        }
        
        List<Objednavka> result = new ArrayList<>();
        for (Objednavka o : objednavkas) {
            if (o.getZakaznik().equals(zakaznik)) {
                result.add(o);
            }
        }

        return result;
    }

} 
