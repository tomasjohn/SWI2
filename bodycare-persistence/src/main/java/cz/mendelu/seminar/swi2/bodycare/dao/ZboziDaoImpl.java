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
    public List<Zbozi> findByNazev(String nazev) {
        try {
            return entityManager.createQuery("SELECT p FROM Zbozi p WHERE nazev LIKE '" + nazev + "'", Zbozi.class).getResultList();
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }
    }

    @Override
    public List<Zbozi> findByZnacka(String znacka) {
        try {
            return entityManager.createQuery("SELECT p FROM Zbozi p WHERE znacka LIKE '" + znacka + "'", Zbozi.class).getResultList();
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }
    }
    
    

    @Override
    public List<Zbozi> findAll() {
        try {
            return entityManager.createQuery("SELECT p FROM Zbozi p", Zbozi.class).getResultList();
        } catch (Exception e) {
            throw new DaoLayerException(e.getMessage());
        }
    }

}
