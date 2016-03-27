package cz.mendelu.seminar.swi2.bodycare.dao;

import cz.mendelu.seminar.swi2.bodycare.domain.Objednavka;

import java.util.List;

/**
 * Data Access Object providing access to database operations for Objednavka entity
 *
 * @puvodni author Pavel Kouřil
 */
public interface ObjednavkaDao {

    /**
     * Finds Objednavka by given ID (primary key)
     */
    Objednavka findById(int id);

    /**
     * Saves Objednavka entity to database, can either update existing Objednavka or save new one
     */
    void save(Objednavka objednavka);

    /**
     * Deletes given entity from database
     */
    void delete(Objednavka objednavka);

    /**
     * Returns all existing Objednavka entities in database
     */
    List<Objednavka> findAll();

}
