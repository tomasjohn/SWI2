package cz.mendelu.seminar.swi2.bodycare.dao;
import cz.mendelu.seminar.swi2.bodycare.domain.Sklad;
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
        int id = testSklad.getId();
        Sklad result = skladDao.findById(id);
        assertEquals(testSklad.getId(), result.getId());
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
        Sklad sklad = new Sklad("Centralni");
        Sklad sklad2 = new Sklad("Centralni2");
        skladDao.save(sklad);
        skladDao.save(sklad2);
        
        assertEquals(skladDao.findAll().size(), 3);
    }
    
}
