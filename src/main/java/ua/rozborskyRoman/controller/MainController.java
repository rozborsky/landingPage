package ua.rozborskyRoman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import ua.rozborskyRoman.classes.Employee;
import ua.rozborskyRoman.classes.SendLetter;
import ua.rozborskyRoman.interfaces.InsertEmployee;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;


/**
 * Created by roman on 19.07.2016.
 */
@Controller
@SessionAttributes("employee")
public class MainController {

    @Autowired
    @Qualifier("insertToMySQL")
    private InsertEmployee insertEmployee;

    @Autowired
    private SendLetter sendLetter;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String registration( Model model) {
        model.addAttribute("employee", new Employee());
        return "registration";
    }

    @RequestMapping(value = "/personData", method = RequestMethod.POST)
    public String personData(@Valid @ModelAttribute Employee employee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "registration";
        }
        return "personData";
    }

    @RequestMapping(value = "/confirmation", method = RequestMethod.POST)
    public String confirmation(HttpSession session, @ModelAttribute Employee employee, SessionStatus status) {
        status.setComplete();
        //insertEmployee.insert(employee);
        //sendLetter.send();//TODO add parameters
        return "confirmation";
    }
}