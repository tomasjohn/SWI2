/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.seminar.swi2.bodycare.facade;

import cz.mendelu.seminar.swi2.bodycare.dto.ObjednavkaDTO;
import java.util.List;

/**
 *
 * @author James
 */
public interface ObjednavkaFacade {

    List<ObjednavkaDTO> getAllObjednavkas();

    ObjednavkaDTO getObjednavkaWithId(int id);

}
