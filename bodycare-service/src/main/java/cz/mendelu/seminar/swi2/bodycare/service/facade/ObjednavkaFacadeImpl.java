/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.seminar.swi2.bodycare.service.facade;

import cz.mendelu.seminar.swi2.bodycare.dto.ObjednavkaDTO;
import cz.mendelu.seminar.swi2.bodycare.facade.ObjednavkaFacade;
import cz.mendelu.seminar.swi2.bodycare.service.BeanMappingService;
import cz.mendelu.seminar.swi2.bodycare.service.ObjednavkaService;
import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional
public class ObjednavkaFacadeImpl implements ObjednavkaFacade {

    @Inject
    private ObjednavkaService objednavkaService;

    @Inject
    private BeanMappingService beanMappingService;

    @Override
    public List<ObjednavkaDTO> getAllObjednavkas() {
	return beanMappingService.mapTo(objednavkaService.findAll(), ObjednavkaDTO.class);
    }

    @Override
    public ObjednavkaDTO getObjednavkaWithId(int id) {
	return beanMappingService.mapTo(objednavkaService.findById(id), ObjednavkaDTO.class);
    }

}
