package cz.mendelu.seminar.swi2.bodycare.dao;

import cz.mendelu.seminar.swi2.bodycare.domain.Zakaznik;
import cz.mendelu.seminar.swi2.bodycare.utils.DaoLayerException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Implementation of ZakaznikDao interface.
 *
 */
@Repository
@Transactional
public class ZakaznikDaoImpl implements ZakaznikDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Zakaznik findById(int id) {
        try {
            return entityManager.find(Zakaznik.class, id);
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }
    }

    @Override
    public void save(Zakaznik zakaznik) {
        if (findById(zakaznik.getId()) != null) {
            try {
                entityManager.merge(zakaznik);
            } catch (Exception e) {
                throw new DaoLayerException(e.getMessage());
            }
        } else {
            try {
                entityManager.persist(zakaznik);
            } catch (Exception e) {
                throw new DaoLayerException(e.getMessage());
            }
        }
    }

    @Override
    public void delete(Zakaznik zakaznik) {
        try {
            entityManager.remove(findById(zakaznik.getId()));
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }
    }

    @Override
    public List<Zakaznik> findAll() {
        try {
            return entityManager.createQuery("select p from Zakaznik p", Zakaznik.class).getResultList();
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }
    }

}
