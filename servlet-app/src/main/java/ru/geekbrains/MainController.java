package ru.geekbrains;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MainController {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String mainPage(Model model){
        model.addAttribute("message", "author");
        return "index";
    }
}
