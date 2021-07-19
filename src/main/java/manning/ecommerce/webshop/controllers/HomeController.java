package manning.ecommerce.webshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showHomePage(Model model){
        model.addAttribute("title", "Hello");
        return "index";
    }
}
