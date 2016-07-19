package ua.rozborskyRoman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by roman on 19.07.2016.
 */
@Controller
public class MainController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String registration() {
        return "registration";
    }

    @RequestMapping(value = "/personData", method = RequestMethod.GET)
    public String start() {
        return "personData";
    }

    @RequestMapping(value = "/confirmation", method = RequestMethod.GET)
    public String confirmation() {
        return "confirmation";
    }
}
