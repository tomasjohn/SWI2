/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.mendelu.seminar.swi2.bodycare.mvc.controllers;
/*
import cz.fi.muni.pa165.seminar.pkmnleague.dto.ObjednavkaCreateDTO;
import cz.fi.muni.pa165.seminar.pkmnleague.dto.ObjednavkaDTO;
import cz.fi.muni.pa165.seminar.pkmnleague.dto.ObjednavkaEditDTO;
import cz.fi.muni.pa165.seminar.pkmnleague.exceptions.ObjednavkaLeagueServiceException;
import cz.fi.muni.pa165.seminar.pkmnleague.facade.ObjednavkaFacade;
import cz.fi.muni.pa165.seminar.pkmnleague.facade.TrainerFacade;*/
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
/*
    @ModelAttribute("objednavka")
    public ObjednavkaCreateDTO getObjednavka() {
        return new ObjednavkaCreateDTO();
    }
    
    @ModelAttribute("objednavkaEdited")
    public ObjednavkaEditDTO getObjednavkaEdited() {
        return new ObjednavkaEditDTO();
    }
*/
    @Autowired
    ObjednavkaFacade objednavkaFacade;

    @Autowired
    private TrainerFacade trainerFacade;

    //*
     /* Lists all objednavka of logged trainer.
     /*
     /* @param model
     /* @return
     //
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String objednavkas(Model model, Principal principal) {
        log.info("Objednavkas = {}", objednavkaFacade.getAllObjednavkas());

        String trainerName = principal.getName();

        List<ObjednavkaDTO> objednavkaDTOs = objednavkaFacade.getAllObjednavkas();
        List<ObjednavkaDTO> result = new ArrayList<>();
        for (ObjednavkaDTO p : objednavkaDTOs) {
            if (p.getTrainer().getEmail().equals(trainerName)) {
                result.add(p);
            }
        }

        model.addAttribute("objednavkas", result);
        return "objednavka/list";
    }

    @RequestMapping(value = "/level-up/{id}", method = RequestMethod.GET)
    public String levelUp(@PathVariable int id, RedirectAttributes redirectAttributes, Principal principal) {
        if (!trainerFacade.getTrainerWithEmail(principal.getName()).equals(objednavkaFacade.getObjednavkaWithId(id).getTrainer())) {
            redirectAttributes.addFlashAttribute("alert_danger", "You can't modify Pokémon you don't own!");
            return "redirect:/objednavka/list";
        }

        try {
            objednavkaFacade.levelUpObjednavkaWithId(id);
        } catch (ObjednavkaLeagueServiceException ex) {
            redirectAttributes.addFlashAttribute("alert_warning", "Pokémon can't have level bigger than 100!");
            return "redirect:/objednavka/list";
        }

        redirectAttributes.addFlashAttribute("alert_info", "Objednavka was successfully leveled up!");
        return "redirect:/objednavka/list";
    }

  //
    / * Runs a new page with a form for new objednavkas.
    / *
     /* @param model
     /* @return
     /
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create(Model model) {
        log.debug("Create new objednavka");
        model.addAttribute("createObjednavka", new ObjednavkaCreateDTO());
        return "objednavka/create";
    }

    
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String edit(Model model,@PathVariable int id){
        log.debug("Edit existing objednavka");
        ObjednavkaEditDTO pok=new ObjednavkaEditDTO();
        
        ObjednavkaDTO existPok=objednavkaFacade.getObjednavkaWithId(id);
        pok.setId(id);
        pok.setNickname(existPok.getNickname());
        model.addAttribute("editObjednavka", pok);
        return "objednavka/edit";
    }
    
    
    @RequestMapping(value = "edit", method = RequestMethod.POST)
    public String edit(@Valid @ModelAttribute("objednavkaEdited") ObjednavkaEditDTO objednavka, BindingResult bindingResult,
                         RedirectAttributes redirectAttributes, UriComponentsBuilder uriBuilder, Principal principal) {

        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("alert_failure", "Some data were not filled!");
            return "redirect:" + uriBuilder.path("/objednavka/edit").build();
        }
        
        objednavkaFacade.changeNickName(objednavka.getNickname(), objednavka.getId());

        redirectAttributes.addFlashAttribute("alert_success", "Objednavka was successfully edited.");

        return "redirect:" + uriBuilder.path("/objednavka/list").build();

    }
    
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(@Valid @ModelAttribute("objednavka") ObjednavkaCreateDTO objednavka, BindingResult bindingResult,
                         RedirectAttributes redirectAttributes, UriComponentsBuilder uriBuilder, Principal principal) {

        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("alert_failure", "Some data were not filled!");
            return "redirect:" + uriBuilder.path("/objednavka/create").build();
        }
        objednavka.setTrainer(trainerFacade.getTrainerWithEmail(principal.getName()));
        objednavkaFacade.createObjednavka(objednavka);

        redirectAttributes.addFlashAttribute("alert_success", "Objednavka was successfully created.");

        return "redirect:" + uriBuilder.path("/objednavka/list").build();

    }
    
    
    
    */
    
}

