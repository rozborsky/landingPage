package ua.rozborskyRoman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.rozborskyRoman.classes.Person;

import javax.servlet.http.HttpSession;


/**
 * Created by roman on 19.07.2016.
 */
@Controller
public class MainController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String registration() {
        return "registration";
    }

    @RequestMapping(value = "/personData", method = RequestMethod.POST)
    public String personData() {
        return "personData";
    }

    @RequestMapping(value = "/confirmation", method = RequestMethod.POST)
    public String confirmation() {
        return "confirmation";
    }
}
