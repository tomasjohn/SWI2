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
 * @author jakub
 */
public class ObjednavkaDaoImplTest {
    
    public ObjednavkaDaoImplTest() {
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
     * Test of findById method, of class ObjednavkaDaoImpl.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        ObjednavkaDaoImpl instance = new ObjednavkaDaoImpl();
        Objednavka expResult = null;
        Objednavka result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class ObjednavkaDaoImpl.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Objednavka objednavka = null;
        ObjednavkaDaoImpl instance = new ObjednavkaDaoImpl();
        instance.save(objednavka);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ObjednavkaDaoImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Objednavka objednavka = null;
        ObjednavkaDaoImpl instance = new ObjednavkaDaoImpl();
        instance.delete(objednavka);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class ObjednavkaDaoImpl.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        ObjednavkaDaoImpl instance = new ObjednavkaDaoImpl();
        List<Objednavka> expResult = null;
        List<Objednavka> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
