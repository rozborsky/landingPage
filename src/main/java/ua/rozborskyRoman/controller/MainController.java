package ua.rozborskyRoman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.rozborskyRoman.classPackage.user;

import javax.validation.Valid;


/**
 * Created by roman on 19.07.2016.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView registration() {
        return new ModelAndView ("registration", "user", new user());
    }

    @RequestMapping(value = "/personData", method = RequestMethod.POST)
    public ModelAndView personData(@Valid @ModelAttribute user user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView ("registration");
        }
        return new ModelAndView ("personData");
    }

    @RequestMapping(value = "/confirmation", method = RequestMethod.POST)
    public String confirmation(@ModelAttribute user user) {
        return "confirmation";
    }
}
