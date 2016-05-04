


package cz.mendelu.seminar.swi2.bodycare.dao;

import cz.mendelu.seminar.swi2.bodycare.domain.Sklad;
import cz.mendelu.seminar.swi2.bodycare.domain.Zakaznik;
import cz.mendelu.seminar.swi2.bodycare.utils.EmbeddedDerbyDatabase;
import java.util.List;

import java.sql.Date;
import javax.inject.Inject;
import org.junit.After;
import org.junit.AfterClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.testng.annotations.BeforeMethod;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xjohn
 */

@ContextConfiguration(classes = EmbeddedDerbyDatabase.class)
@TestExecutionListeners(TransactionalTestExecutionListener.class)
@Transactional
public class ZakaznikDaoImplTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private ZakaznikDao zakaznikDao;
    
    private Zakaznik testZakaznik;
    
    public ZakaznikDaoImplTest() {
    }
    
    @BeforeMethod
    public void setUp() {
        testZakaznik = new Zakaznik(0, "František Dobrota", "Lesnická 15, Brno");
        zakaznikDao.save(testZakaznik);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findById method, of class ZakaznikDaoImpl.
     */
    @Test
    public void testFindById() { 
        System.out.println("testDindById");
        int id = testZakaznik.getId();
        Zakaznik result = zakaznikDao.findById(id);
        assertEquals(testZakaznik.getId(), result.getId());
    }

    /**
     * Test of save method, of class ZakaznikDaoImpl.
     */
    @Test
    public void testSave() {
        assertEquals(1, zakaznikDao.findAll().size());
    }

    /**
     * Test of delete method, of class ZakaznikDaoImpl.
     */
    @Test
    public void testDelete() {
        zakaznikDao.delete(testZakaznik);
        assertEquals(0, zakaznikDao.findAll().size());
    }

    /**
     * Test of findAll method, of class ZakaznikDaoImpl.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        Zakaznik zakaznik1 = new Zakaznik(0, "František Dobrota", "Lesnická 15, Brno");
        Zakaznik zakaznik2 = new Zakaznik(10,"Centralni","Listova 5, Brno");
        zakaznikDao.save(zakaznik1);
        zakaznikDao.save(zakaznik2);
        assertEquals(zakaznikDao.findAll().size(), 3);
    }
    
}