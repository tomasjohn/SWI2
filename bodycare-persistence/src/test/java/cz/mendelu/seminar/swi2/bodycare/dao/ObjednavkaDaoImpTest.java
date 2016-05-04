package cz.mendelu.seminar.swi2.bodycare.dao;

import cz.mendelu.seminar.swi2.bodycare.domain.Objednavka;
import cz.mendelu.seminar.swi2.bodycare.domain.Zakaznik;
import cz.mendelu.seminar.swi2.bodycare.utils.EmbeddedDerbyDatabase;

import org.junit.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.junit.Assert.*;

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
public class ObjednavkaDaoImpTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private ObjednavkaDao objednavkaDao;
    private Objednavka testObjednavka;
    
    public ObjednavkaDaoImpTest() {
    }
    
    @BeforeMethod
    public void setUp() {
        testObjednavka = new Objednavka(new Zakaznik(0, "František Dobrota", "Lesnická 15, Brno"));
        objednavkaDao.save(testObjednavka);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findById method, of class ObjednavkaDaoImpl.
     */
    @Test
    public void testFindById() { 
        int id = testObjednavka.getId();
        Objednavka result = objednavkaDao.findById(id);
        assertEquals(testObjednavka.getId(), result.getId());
    }

    /**
     * Test of save method, of class ObjednavkaDaoImpl.
     */
    @Test
    public void testSave() {
        assertEquals(1, objednavkaDao.findAll().size());
    }

    /**
     * Test of delete method, of class ObjednavkaDaoImpl.
     */
    @Test
    public void testDelete() {
        objednavkaDao.delete(testObjednavka);
        assertEquals(0, objednavkaDao.findAll().size());
    }

    /**
     * Test of findAll method, of class ObjednavkaDaoImpl.
     */
    @Test
    public void testFindAll() {
        Objednavka objedn1 = new Objednavka(new Zakaznik(0, "František Dobrota", "Lesnická 15, Brno"));
        Objednavka objedn2 = new Objednavka(new Zakaznik(0, "František Dobrota", "Lesnická 15, Brno"));
        objednavkaDao.save(objedn1);
        objednavkaDao.save(objedn2);
        assertEquals(objednavkaDao.findAll().size(), 3);
    }
    
}