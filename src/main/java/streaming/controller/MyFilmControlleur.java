/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.controller;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import streaming.entity.Film;
import streaming.service.FilmServiceCRUD;
import streaming.service.GenreServiceCRUD;

/**
 *
 * @author Administrateur
 */
@Controller
//@RequestMapping("/my-film") racine url !!!!!
public class MyFilmControlleur {

    @Autowired
    private FilmServiceCRUD service;
    @Autowired
    private GenreServiceCRUD genreService;

    @RequestMapping(value = "/my-film-list", method = RequestMethod.GET)
    public String lister(Model model) {
        // lister les films
        model.addAttribute("mesFilms", service.findAll());
        return "my-film-list.jsp";
    }

    @RequestMapping(value = "/my-film-form", method = RequestMethod.GET)
    public String formulaire(Model model) {

        Film f = new Film();
        f.setTitre("coucou");
        model.addAttribute("film", f);
        model.addAttribute("genres",genreService.findAll());
        // form binding
        return "my-film-form.jsp";

    }
    @Transactional
    @RequestMapping(value = "/my-film-form", method = RequestMethod.POST)
    public String enregistrerFilm(@ModelAttribute("film") Film nouveauFilm){
        service.save(nouveauFilm);
        return "redirect:/my-film-list";
    }
}
