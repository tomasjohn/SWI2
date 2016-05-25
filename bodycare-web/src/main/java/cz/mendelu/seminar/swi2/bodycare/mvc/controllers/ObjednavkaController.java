/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.seminar.swi2.bodycare.mvc.controllers;

import cz.mendelu.seminar.swi2.bodycare.service.facade.ObjednavkaFacadeImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;

@Controller
@RequestMapping("/objednavka")
public class ObjednavkaController {

    final static Logger log = LoggerFactory.getLogger(ObjednavkaController.class);

    @Autowired
    public ObjednavkaFacadeImpl objednavkaFacade;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String objednavkas(Model model, Principal principal) {
	log.info("Objednavkas = {}", objednavkaFacade.getAllObjednavkas());
	model.addAttribute("objednavkas", objednavkaFacade.getAllObjednavkas());
	return "objednavka/list";
    }

    @RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
    public String objednavka(Model model, @PathVariable int id) {
	model.addAttribute("objednavka", objednavkaFacade.getObjednavkaWithId(id));
	return "objednavka/detail";
    }
}
