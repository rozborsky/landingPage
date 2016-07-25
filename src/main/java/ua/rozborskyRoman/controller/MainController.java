package ua.rozborskyRoman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import ua.rozborskyRoman.classPackage.Employee;
import ua.rozborskyRoman.classPackage.InsertEmployeeMySQL;
import ua.rozborskyRoman.interfaces.Person;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;


/**
 * Created by roman on 19.07.2016.
 */
@Controller
@SessionAttributes("employee")
public class MainController {

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
        //status.setComplete();
        //new SendLetter();//TODO add parameters in constructor
//        InsertEmployeeMySQL insertEmployee = new InsertEmployeeMySQL();//TODO   <---new
//        insertEmployee.insert(user);
        return "confirmation";
    }
}
