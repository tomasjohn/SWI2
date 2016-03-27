package cz.mendelu.seminar.swi2.bodycare.dao;

import cz.mendelu.swi2.bodycare.domain.Sklad;

import java.util.List;

/**
 * Data Access Object providing access to database operations for Sklad entity
 */
public interface SkladDao {

    /**
     * Finds Sklad by given ID (primary key)
     */
    Sklad findById(int id);

    /**
     * Saves Sklad entity to database, can either update existing Sklad or save new one
     */
    void save(Sklad sklad);

    /**
     * Deletes given entity from database
     */
    void delete(Sklad sklad);

    /**
     * Returns all existing Sklad entities in database
     */
    List<Sklad> findAll();

}
