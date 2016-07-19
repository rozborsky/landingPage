package ua.rozborskyRoman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.rozborskyRoman.classPackage.user;

import javax.servlet.http.HttpSession;
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
    public String personData(@Valid @ModelAttribute user user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "registration";
        }
        model.addAttribute("user", user);
        return "personData";
    }

    @RequestMapping(value = "/confirmation", method = RequestMethod.POST)
    public String confirmation() {
        return "confirmation";
    }
}
