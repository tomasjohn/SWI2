/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.seminar.swi2.bodycare.mvc.controllers;

import cz.mendelu.seminar.swi2.bodycare.dto.ObjednavkaDTO;
import cz.mendelu.seminar.swi2.bodycare.service.ObjednavkaService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.util.UriComponentsBuilder;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dhanak @domhanak on 12/18/15.
 */
@Controller
@RequestMapping("/objednavka")
public class ObjednavkyController {

    final static Logger log = LoggerFactory.getLogger(ObjednavkyController.class);

    @Autowired
    ObjednavkaService objednavkaService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String objednavkas(Model model, Principal principal) {
	log.info("Objednavkas = {}", objednavkaService.findAll());
	model.addAttribute("objednavkas", objednavkaService.findAll());
	return "objednavka/list";
    }

    @RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
    public String objednavka(Model model, @PathVariable int id) {
	model.addAttribute("objednavka", objednavkaService.findById(id));
	return "objednavka/detail";
    }
}
