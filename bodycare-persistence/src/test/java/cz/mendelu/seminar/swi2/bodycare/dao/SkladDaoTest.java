package cz.mendelu.seminar.swi2.bodycare.dao;

import cz.mendelu.seminar.swi2.bodycare.domain.Sklad;
import cz.fi.muni.pa165.seminar.pkmnleague.utils.EmbeddedDerbyDatabase;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

/**
 * @author Zuzana Goldmannova
 */
@ContextConfiguration(classes = EmbeddedDerbyDatabase.class)
@TestExecutionListeners(TransactionalTestExecutionListener.class)
@Transactional
public class SkladDaoTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private Sklad skladDao;

    @Test
    public void testSave() {
        Sklad sklad = new Sklad("Centralni_sklad");

        sklad.save(sklad);
        
        Sklad result = skladDao.findById(sklad.getId());
        assertEquals(sklad, result);


    }

    @Test
    public void testDelete() {
        Sklad sklad = new Sklad("Centralni_sklad");

        skladDao.save(sklad);
        skladDao.delete(sklad);

        assertEquals(0, skladDao.findAll().size());
    }

    @Test
    public void testFindAll() {
        Sklad trainer = new Sklad("Centralni_sklad");

        skladDao.save(trainer);

        assertEquals(1, skladDao.findAll().size());
    }

}