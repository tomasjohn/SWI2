package cz.mendelu.seminar.swi2.bodycare.dao;

import cz.mendelu.seminar.swi2.bodycare.domain.Objednavka;
import cz.mendelu.seminar.swi2.bodycare.domain.Zbozi;
import cz.mendelu.seminar.swi2.bodycare.utils.DaoLayerException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Implementation of ObjednavkaDao interface.
 *
 */
@Repository
@Transactional
public class ObjednavkaDaoImpl implements ObjednavkaDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Objednavka findById(int id) {
	try {
	    return entityManager.find(Objednavka.class, id);
	} catch (Exception e) {
	    throw new DaoLayerException(e.getMessage());
	}
    }

    @Override
    public void save(Objednavka objednavka) {
	if (findById(objednavka.getId()) != null) {
	    try {
		entityManager.merge(objednavka);
	    } catch (Exception e) {
		throw new DaoLayerException(e.getMessage());
	    }
	} else {
	    try {
		entityManager.persist(objednavka);
	    } catch (Exception e) {
		throw new DaoLayerException(e.getMessage());
	    }
	}
    }

    @Override
    public void delete(Objednavka objednavka) {
	try {
	    entityManager.remove(findById(objednavka.getId()));
	} catch (Exception e) {
	    throw new DaoLayerException(e.getMessage());
	}
    }

    @Override
    public List<Objednavka> findAll() {
	try {
	    return entityManager.createQuery("select p from Objednavka p", Objednavka.class).getResultList();
	} catch (Exception e) {
	    throw new DaoLayerException(e.getMessage());
	}
    }

}
