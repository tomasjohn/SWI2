/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.seminar.swi2.bodycare.dao;

import cz.mendelu.seminar.swi2.bodycare.domain.Objednavka;
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
public class ObjednavkaDaoTest {
    
    public ObjednavkaDaoTest() {
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
     * Test of findById method, of class ObjednavkaDao.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        ObjednavkaDao instance = new ObjednavkaDaoImpl();
        Objednavka expResult = null;
        Objednavka result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class ObjednavkaDao.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Objednavka objednavka = null;
        ObjednavkaDao instance = new ObjednavkaDaoImpl();
        instance.save(objednavka);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ObjednavkaDao.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Objednavka objednavka = null;
        ObjednavkaDao instance = new ObjednavkaDaoImpl();
        instance.delete(objednavka);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class ObjednavkaDao.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        ObjednavkaDao instance = new ObjednavkaDaoImpl();
        List<Objednavka> expResult = null;
        List<Objednavka> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ObjednavkaDaoImpl implements ObjednavkaDao {

        public Objednavka findById(int id) {
            return null;
        }

        public void save(Objednavka objednavka) {
        }

        public void delete(Objednavka objednavka) {
        }

        public List<Objednavka> findAll() {
            return null;
        }
    }
    
}
