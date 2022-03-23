package com.example.songr.controllar;

import com.example.songr.classes.Albums;
import com.example.songr.classes.capitalize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller

public class GreetingsController {


        @GetMapping("/")
        @ResponseBody
        String home(){
            return "home";
        }
        @GetMapping("/hello")
       @ResponseBody
        String greeting(){
            return "hello world";
        }
        @GetMapping("/upperCase/{text}")
        @ResponseBody
        String upperCase(@PathVariable String text, Model model){
            model.addAttribute("text", text.toUpperCase());
            return "UpperCase";
        }

//    @GetMapping("/capitalize/{hello}")
//    @ResponseBody
//    public String capitalizer(@PathVariable String hello, Model model) {
//        String capital = capitalize.wordCapital(hello);
//        model.addAttribute("word", capital);
//        return "capitalized";
//    }


    @GetMapping("/albums")
    @ResponseBody
    public Albums[] albums(Model model) {

        Albums a = new Albums(1 , 2545 , 454545 , "hamzeh" , "url" , "hamzeh" );
        Albums b = new Albums(2 , 464 , 454545 , "hamzeh" , "url" , "hamzeh" );
        Albums c = new Albums(3 , 2545 , 454545 , "hamzeh" , "url" , "hamzeh" );
        Albums[] albums = {a, b, c};
        model.addAttribute("albums", albums);
        //  System.out.println("hamzeh");
       return albums;

        }
    }

