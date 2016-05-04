/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cz.mendelu.seminar.swi2.bodycare.exceptions;

/**
 *
 * @author xstrati6
 */
public class BodycareServiceException extends RuntimeException{

    public BodycareServiceException() {
        super();
    }

    public BodycareServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public BodycareServiceException(String message) {
        super(message);
    }

}