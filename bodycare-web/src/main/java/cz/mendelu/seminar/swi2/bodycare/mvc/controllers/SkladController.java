/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.seminar.swi2.bodycare.mvc.controllers;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import cz.mendelu.seminar.swi2.bodycare.dto.SkladDTO;

import java.security.Principal;
import org.springframework.web.bind.annotation.ModelAttribute;
 
/**
 * @author xjanca
 */
@Controller
@RequestMapping("/sklady")
public class SkladController {

   //final static Logger log = LoggerFactory.getLogger(SkladController.class);

   /* @Autowired
    private SkladFacade skladFacade;
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String objednavky(Model model, Principal principal) {
	//log.info("Objednavkas = {}", objednavkaFacade.getAllObjednavkas());
	//model.addAttribute("sklads", skladFacade.getAllSklads());
	return "sklady/list";
    }*/
}
