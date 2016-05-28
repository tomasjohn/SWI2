/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.seminar.swi2.bodycare.service.facade;

import cz.mendelu.seminar.swi2.bodycare.dto.SkladDTO;
import cz.mendelu.seminar.swi2.bodycare.facade.SkladFacade;
import cz.mendelu.seminar.swi2.bodycare.service.BeanMappingService;
import cz.mendelu.seminar.swi2.bodycare.service.SkladService;
import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author James
 */
@Service
@Transactional
public class SkladFacadeImpl implements SkladFacade {
        
    @Inject
    private SkladService skladService;

    @Inject
    private BeanMappingService beanMappingService;

    @Override
    public List<SkladDTO> getAllSklads() {
	return beanMappingService.mapTo(skladService.findAll(), SkladDTO.class);
    }

    @Override
    public SkladDTO getSkladWithId(int id) {
	return beanMappingService.mapTo(skladService.findById(id), SkladDTO.class);
    }
}
