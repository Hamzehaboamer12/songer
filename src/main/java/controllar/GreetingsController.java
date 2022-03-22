package controllar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller

public class GreetingsController {


        @GetMapping("/")
        String home(){
            return "home";
        }
        @GetMapping("/hello")
        String greeting(){
            return "hello";
        }
        @GetMapping("/upperCase/{text}")
        String upperCase(@PathVariable String text, Model model){
            model.addAttribute("text", text.toUpperCase());
            return "UpperCase";
        }
}
