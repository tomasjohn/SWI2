/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.seminar.swi2.bodycare.mvc.controllers;

import cz.mendelu.seminar.swi2.bodycare.dto.SkladDTO;
import cz.mendelu.seminar.swi2.bodycare.service.SkladService;

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
 * @author xjanca
 */
@Controller
@RequestMapping("/sklad")
public class SkladController {

    final static Logger log = LoggerFactory.getLogger(SkladController.class);

    @Autowired
    private SkladService skladService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String sklads(Model model, Principal principal) {
	log.info("Sklady = {}", skladService.findAll());
	model.addAttribute("sklady", skladService.findAll());
	return "sklad/list";
    }

    @RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
    public String sklad(Model model, @PathVariable int id) {
	model.addAttribute("sklad", skladService.findById(id));
	return "sklad/detail";
    }
}
