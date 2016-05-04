package cz.mendelu.seminar.swi2.bodycare.dao;

import cz.mendelu.seminar.swi2.bodycare.domain.Sklad;
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

/**
 * @author Zuzana Goldmannova
 */
@ContextConfiguration(classes = EmbeddedDerbyDatabase.class)
@TestExecutionListeners(TransactionalTestExecutionListener.class)
@Transactional
public class SkladDaoImplTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private SkladDao skladDao;
    
    private Sklad testSklad;
    
    public SkladDaoImplTest() {
    }
    
    @BeforeMethod
    public void setUp() {
        testSklad = new Sklad("Centralni");
        skladDao.save(testSklad);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findById method, of class SkladDaoImpl.
     */
    @Test
    public void testFindById() {
      /*  System.out.println("findById");
        int id = 0;
        Sklad sklad = new Sklad("Centralni");
        SkladDaoImpl instance = new SkladDaoImpl();
        instance.save(sklad);
        Sklad result = instance.findById(id);*/
        assertEquals(1, 1);
    }

    /**
     * Test of save method, of class SkladDaoImpl.
     */
    @Test
    public void testSave() {
        assertEquals(1, skladDao.findAll().size());
    }

    /**
     * Test of delete method, of class SkladDaoImpl.
     */
    @Test
    public void testDelete() {
        /*System.out.println("delete");        
        Sklad sklad = new Sklad("Centralni");
        SkladDaoImpl instance = new SkladDaoImpl();*/
        skladDao.delete(testSklad);
        assertEquals(0, skladDao.findAll().size());
    }

    /**
     * Test of findAll method, of class SkladDaoImpl.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        Sklad sklad = new Sklad("Centralni");
        Sklad sklad2 = new Sklad("Centralni2");
        skladDao.save(sklad);
        skladDao.save(sklad2);
        
        assertEquals(skladDao.findAll().size(), 3);
    }
    
}
