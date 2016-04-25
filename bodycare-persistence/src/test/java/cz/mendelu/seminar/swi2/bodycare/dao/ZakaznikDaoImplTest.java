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
 * @author jakub
 */
public class ZakaznikDaoImplTest {
    
    public ZakaznikDaoImplTest() {
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
     * Test of findById method, of class ZakaznikDaoImpl.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        ZakaznikDaoImpl instance = new ZakaznikDaoImpl();
        Zakaznik expResult = null;
        Zakaznik result = instance.findById(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of save method, of class ZakaznikDaoImpl.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Zakaznik zakaznik = null;
        ZakaznikDaoImpl instance = new ZakaznikDaoImpl();
        instance.save(zakaznik);
    }

    /**
     * Test of delete method, of class ZakaznikDaoImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Zakaznik zakaznik = null;
        ZakaznikDaoImpl instance = new ZakaznikDaoImpl();
        instance.delete(zakaznik);
    }

    /**
     * Test of findAll method, of class ZakaznikDaoImpl.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        ZakaznikDaoImpl instance = new ZakaznikDaoImpl();
        List<Zakaznik> expResult = null;
        List<Zakaznik> result = instance.findAll();
        assertEquals(expResult, result);
    }
    
}
