package cz.mendelu.seminar.swi2.bodycare.dao;

import cz.mendelu.seminar.swi2.bodycare.domain.Zbozi;

import java.util.List;

/**
 * Data Access Object providing access to database operations for Zbozi entity
 *
 * @puvodni author Pavel Kouřil
 */
public interface ZboziDao {

    /**
     * Finds Zbozi by given ID (primary key)
     * @param int id
     * @return Zbozi
     */
    Zbozi findById(int id);

    /**
     * Saves Zbozi entity to database, can either update existing Zbozi or save new one
     */
    void save(Zbozi zbozi);

    /**
     * Deletes given entity from database
     */
    void delete(Zbozi zbozi);
    
    /**
     * Finds Zbozi by given name
     * @param String nazev
     * @return List
     */
    List<Zbozi> findByNazev(String nazev);
    
    /**
     * Finds Zbozi by given brand
     * @param String znacka
     * @return List
     */
    List<Zbozi> findByZnacka(String znacka);

    /**
     * Returns all existing Zbozi entities in database
     */
    List<Zbozi> findAll();

}
