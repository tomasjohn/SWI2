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
    public Objednavka findById(int id) {
        return objednavkaDao.findById(id);
    }

    @Override
    public void createObjednavka(Objednavka objednavka) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Objednavka> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Objednavka objednavka) {
        objednavkaDao.delete(objednavka);
    }

    @Override
    public List<Objednavka> getAllObjednavkaByZakaznik(Zakaznik zakaznik) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
