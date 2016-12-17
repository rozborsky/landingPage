package ua.rozborskyRoman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import ua.rozborskyRoman.classes.ImageManager;
import ua.rozborskyRoman.classes.SendLetter;
import ua.rozborskyRoman.interfaces.Employee;
import ua.rozborskyRoman.interfaces.InsertEmployee;


import javax.validation.Valid;


/**
 * Created by roman on 19.07.2016.
 */
@Controller
@SessionAttributes("employee")
public class MainController {

    @Autowired
    Employee employee;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main() {

        return new ModelAndView("enterData", "employee", employee);
    }

    @RequestMapping(value = "/confirmation ", method = RequestMethod.POST)
    public String confirmation(@Valid @ModelAttribute Employee employee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "enterData";
        }
        return "confirmation";
    }









    @Autowired
    @Qualifier("insertToSQLite")
    private InsertEmployee insertEmployee;

    @Autowired
    private SendLetter sendLetter;

    @Autowired
    private ImageManager imageManager;


    @RequestMapping(value = "/personData", method = RequestMethod.POST)
    public String personData(@Valid @ModelAttribute Employee employee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "registration";
        }
        return "personData";
    }

    @RequestMapping(value = "/confirmation", method = RequestMethod.POST)
    public ModelAndView confirmation(Employee employee, SessionStatus status,
                               @RequestParam(value = "image", required = false)MultipartFile image) {

        if (!image.isEmpty()) {
            ModelAndView result = saveImage(employee, image);
            if (result != null) return result;
        }

        status.setComplete();
        insertEmployee.insert(employee);
        //sendLetter.send();//TODO add parameters
        return new ModelAndView("confirmation", "", "");
    }


    private ModelAndView saveImage(Employee employee, @RequestParam(value = "image", required = false) MultipartFile image) {
        try{
            imageManager.validateImage(image);
        } catch (RuntimeException exception) {
            return new ModelAndView("personData", "error", "Only JPG images are accepted");
        }
//        try{
//            String newName = employee.getName() + employee.getSurname() + ".jpg";
//            imageManager.saveImage(newName, image);
//            employee.setPhoto(newName);
//        }catch (RuntimeException rException) {
//            return new ModelAndView("personData", "error", "cant save image");
//        }
        return null;
    }
}