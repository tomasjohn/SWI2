/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.seminar.swi2.bodycare.dao;

import cz.mendelu.seminar.swi2.bodycare.domain.Sklad;
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
public class SkladDaoImplTest {
    
    public SkladDaoImplTest() {
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
     * Test of findById method, of class SkladDaoImpl.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        SkladDaoImpl instance = new SkladDaoImpl();
        Sklad expResult = null;
        Sklad result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class SkladDaoImpl.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Sklad sklad = null;
        SkladDaoImpl instance = new SkladDaoImpl();
        instance.save(sklad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class SkladDaoImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Sklad sklad = null;
        SkladDaoImpl instance = new SkladDaoImpl();
        instance.delete(sklad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class SkladDaoImpl.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        SkladDaoImpl instance = new SkladDaoImpl();
        List<Sklad> expResult = null;
        List<Sklad> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
