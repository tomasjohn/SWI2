/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.seminar.swi2.bodycare.service;

import cz.mendelu.seminar.swi2.bodycare.dao.SkladDao;
import cz.mendelu.seminar.swi2.bodycare.domain.Sklad;

import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author XSTRATI6
 */
public class SkladServiceImpl implements SkladService {

    @Inject
    private SkladDao skladDao;

    @Override
    public void createSklad(Sklad sklad) {
        skladDao.save(sklad);
    }

    @Override
    public Sklad findById(int id) {
        return skladDao.findById(id);
    }

    @Override
    public List<Sklad> findAll() {
        return skladDao.findAll();
    }

    @Override
    public void delete(Sklad sklad) {
        skladDao.delete(sklad);
    }

}
