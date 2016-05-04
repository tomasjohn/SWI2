package cz.mendelu.seminar.swi2.bodycare.dao;
import cz.mendelu.seminar.swi2.bodycare.domain.Zbozi;
import cz.mendelu.seminar.swi2.bodycare.utils.EmbeddedDerbyDatabase;

import org.junit.After;
import org.junit.AfterClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;
import org.junit.BeforeClass;
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
public class ZboziDaoImplTest extends AbstractTestNGSpringContextTests {
    
    @Autowired
    private ZboziDao zboziDao;
    
    private Zbozi testZbozi;
    
    public ZboziDaoImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @BeforeMethod
    public void setUp() {
        testZbozi = new Zbozi(10, 20, "Meno", "Značka");
        zboziDao.save(testZbozi);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findById method, of class ZboziDaoImpl.
     */
    @Test
    public void testFindById() {
        int id = testZbozi.getId();
        Zbozi result = zboziDao.findById(id);
        assertEquals(testZbozi.getId(), result.getId());
    }
    
    /**
     * Test of findById method, of class ZboziDaoImpl.
     */
    @Test
    public void testFindByNazev() {
        String znacka = testZbozi.getNazev();
        Zbozi result = zboziDao.findByNazev(znacka);
        assertEquals(testZbozi.getNazev(), result.getNazev());
    }
    
    /**
     * Test of findById method, of class ZboziDaoImpl.
     */
    @Test
    public void testFindByZnacka() {
        String znacka = testZbozi.getZnacka();
        Zbozi result = zboziDao.findByZnacka(znacka);
        assertEquals(testZbozi.getZnacka(), result.getZnacka());
    }

    /**
     * Test of save method, of class ZboziDaoImpl.
     */
    @Test
    public void testSave() {
        assertEquals(1, zboziDao.findAll().size());
    }

    /**
     * Test of delete method, of class ZboziDaoImpl.
     */
    @Test
    public void testDelete() {
        zboziDao.delete(testZbozi);
        assertEquals(0, zboziDao.findAll().size());
    }

    /**
     * Test of findAll method, of class ZboziDaoImpl.
     */
    @Test
    public void testFindAll() {
        Zbozi zbozi1 = new Zbozi(10, 20, "Zbozi1", "Znacka1");
        Zbozi zbozi2 = new Zbozi(10, 20, "Zbozi2", "Znacka2");
        zboziDao.save(zbozi1);
        zboziDao.save(zbozi2);
        assertEquals(zboziDao.findAll().size(), 3);
    }
    
}
