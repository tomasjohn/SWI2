package cz.mendelu.seminar.swi2.bodycare.utils;

import org.springframework.dao.DataAccessException;

/**
 * @author dhanak @domhanak on 1/24/16.
 */
public class DaoLayerException extends DataAccessException {

    public DaoLayerException(String msg) {
        super(msg);
    }

    public DaoLayerException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
