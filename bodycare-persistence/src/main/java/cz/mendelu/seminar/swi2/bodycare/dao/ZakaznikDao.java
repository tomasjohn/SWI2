package cz.mendelu.seminar.swi2.bodycare.dao;

import cz.mendelu.seminar.swi2.bodycare.domain.Zakaznik;

import java.util.List;

/**
 * Data Access Object providing access to database operations for Zakaznik entity
 *
 * @puvodni author Pavel Kouřil
 */
public interface ZakaznikDao {

    /**
     * Finds Zakaznik by given ID (primary key)
     */
    Zakaznik findById(int id);

    /**
     * Saves Zakaznik entity to database, can either update existing Zakaznik or save new one
     */
    void save(Zakaznik zakaznik);

    /**
     * Deletes given entity from database
     */
    void delete(Zakaznik zakaznik);

    /**
     * Returns all existing Zakaznik entities in database
     */
    List<Zakaznik> findAll();

}
