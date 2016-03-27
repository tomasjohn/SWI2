package cz.mendelu.seminar.swi2.bodycare.dao;

import cz.mendelu.seminar.swi2.bodycare.domain.Zbozi;
import cz.mendelu.seminar.swi2.bodycare.utils.DaoLayerException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Implementation of ZboziDao interface.
 *
 */
@Repository
@Transactional
public class ZboziDaoImpl implements ZboziDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Zbozi findById(int id) {
        try {
            return entityManager.find(Zbozi.class, id);
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }
    }

    @Override
    public void save(Zbozi zbozi) {
        if (findById(zbozi.getId()) != null) {
            try {
                entityManager.merge(zbozi);
            } catch (Exception e) {
                throw new DaoLayerException(e.getMessage());
            }
        } else {
            try {
                entityManager.persist(zbozi);
            } catch (Exception e) {
                throw new DaoLayerException(e.getMessage());
            }
        }
    }

    @Override
    public void delete(Zbozi zbozi) {
        try {
            entityManager.remove(findById(zbozi.getId()));
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }
    }

    @Override
    public List<Zbozi> findAll() {
        try {
            return entityManager.createQuery("select p from Zbozi p", Zbozi.class).getResultList();
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }
    }

}
