/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.seminar.swi2.bodycare.service;

import cz.mendelu.seminar.swi2.bodycare.dao.ZboziDao;
import cz.mendelu.seminar.swi2.bodycare.domain.Zbozi;
import org.springframework.stereotype.Service;

import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author XSTRATI6
 */
@Service
public class ZboziServiceImpl implements ZboziService {

    @Inject
    private ZboziDao zboziDao;

    @Override
    public void create(Zbozi zbozi) {
        zboziDao.save(zbozi);
    }

    @Override
    public Zbozi findById(int id) {
        return zboziDao.findById(id);
    }

    @Override
    public List<Zbozi> findByNazev(String nazev) {
        return zboziDao.findByNazev(nazev);
    }

    @Override
    public List<Zbozi> findByZnacka(String znacka) {
        return zboziDao.findByZnacka(znacka);
    }

    @Override
    public List<Zbozi> findAll() {
        return zboziDao.findAll();
    }

    @Override
    public void delete(Zbozi zbozi) {
        zboziDao.delete(zbozi);
    }

}
