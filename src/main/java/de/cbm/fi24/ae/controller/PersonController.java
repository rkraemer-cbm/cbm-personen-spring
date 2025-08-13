package de.cbm.fi24.ae.controller;

import de.cbm.fi24.ae.model.Person;
import de.cbm.fi24.ae.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public String getPersonById(
            @RequestParam String person_number,
            Model model) {

        Long personId = Long.parseLong(person_number);
        model.addAttribute("person", personService.getPersonById(personId));

        return "index";

    }
}
