/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.seminar.swi2.bodycare.dao;

import cz.mendelu.seminar.swi2.bodycare.domain.Zakaznik;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TJ
 */
public class ZakaznikDaoTest {
    
    public ZakaznikDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findById method, of class ZakaznikDao.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        ZakaznikDao instance = new ZakaznikDaoImpl();
        Zakaznik expResult = null;
        Zakaznik result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class ZakaznikDao.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Zakaznik zakaznik = null;
        ZakaznikDao instance = new ZakaznikDaoImpl();
        instance.save(zakaznik);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ZakaznikDao.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Zakaznik zakaznik = null;
        ZakaznikDao instance = new ZakaznikDaoImpl();
        instance.delete(zakaznik);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class ZakaznikDao.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        ZakaznikDao instance = new ZakaznikDaoImpl();
        List<Zakaznik> expResult = null;
        List<Zakaznik> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ZakaznikDaoImpl implements ZakaznikDao {

        public Zakaznik findById(int id) {
            return null;
        }

        public void save(Zakaznik zakaznik) {
        }

        public void delete(Zakaznik zakaznik) {
        }

        public List<Zakaznik> findAll() {
            return null;
        }
    }
    
}
