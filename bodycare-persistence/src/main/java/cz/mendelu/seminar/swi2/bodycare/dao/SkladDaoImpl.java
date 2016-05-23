package cz.mendelu.seminar.swi2.bodycare.dao;

import cz.mendelu.seminar.swi2.bodycare.domain.Sklad;
import cz.mendelu.seminar.swi2.bodycare.utils.DaoLayerException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Implementation of SkladDao interface.
 *
 */
@Repository
public class SkladDaoImpl implements SkladDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Sklad findById(int id) {
        try {
            return entityManager.find(Sklad.class, id);
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }
    }

    @Override
    public void save(Sklad sklad) {
        if (findById(sklad.getId()) != null) {
            try {
                entityManager.merge(sklad);
            } catch (Exception e) {
                throw new DaoLayerException(e.getMessage());
            }
        } else {
            try {
                entityManager.persist(sklad);
            } catch (Exception e) {
                throw new DaoLayerException(e.getMessage());
            }
        }
    }

    @Override
    public void delete(Sklad sklad) {
        try {
            entityManager.remove(findById(sklad.getId()));
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }
    }

    @Override
    public List<Sklad> findAll() {
        try {
            return entityManager.createQuery("select p from Sklad p", Sklad.class).getResultList();
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }
    }

}
