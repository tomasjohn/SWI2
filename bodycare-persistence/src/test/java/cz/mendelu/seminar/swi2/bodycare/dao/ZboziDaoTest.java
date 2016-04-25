/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.seminar.swi2.bodycare.dao;

import cz.mendelu.seminar.swi2.bodycare.domain.Zbozi;
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
public class ZboziDaoTest {
    
    public ZboziDaoTest() {
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
     * Test of findById method, of class ZboziDao.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        ZboziDao instance = new ZboziDaoImpl();
        Zbozi expResult = null;
        Zbozi result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class ZboziDao.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Zbozi zbozi = null;
        ZboziDao instance = new ZboziDaoImpl();
        instance.save(zbozi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ZboziDao.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Zbozi zbozi = null;
        ZboziDao instance = new ZboziDaoImpl();
        instance.delete(zbozi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class ZboziDao.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        ZboziDao instance = new ZboziDaoImpl();
        List<Zbozi> expResult = null;
        List<Zbozi> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ZboziDaoImpl implements ZboziDao {

        public Zbozi findById(int id) {
            return null;
        }

        public void save(Zbozi zbozi) {
        }

        public void delete(Zbozi zbozi) {
        }

        public List<Zbozi> findAll() {
            return null;
        }
    }
    
}
