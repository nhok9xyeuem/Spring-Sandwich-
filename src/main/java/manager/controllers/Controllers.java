package manager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Controllers {

    @RequestMapping("/")
     public String index(){
        return "index";
    }
    @PostMapping ("/sandwich")
    public  String save (@RequestParam ("condiment") String[] condiment , Model model  ){
       model.addAttribute("condiment", condiment);
        return "sandwich";
    }


}
