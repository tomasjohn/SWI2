/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.seminar.swi2.bodycare.service;

import cz.mendelu.seminar.swi2.bodycare.dao.ZakaznikDao;
import cz.mendelu.seminar.swi2.bodycare.domain.Zakaznik;

import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author XSTRATI6
 */
public class ZakaznikServiceImpl implements ZakaznikService {

    @Inject
    private ZakaznikDao zakaznikDao;

    @Override
    public void createSklad(Zakaznik zakaznik) {
        zakaznikDao.save(zakaznik);
    }

    @Override
    public Zakaznik findById(int id) {
        return zakaznikDao.findById(id);
    }

    @Override
    public List<Zakaznik> findAll() {
        return zakaznikDao.findAll();
    }

    @Override
    public void delete(Zakaznik zakaznik) {
        zakaznikDao.delete(zakaznik);
    }

}
