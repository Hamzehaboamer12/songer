package com.example.songr.controllar;

import com.example.songr.classes.Albums;
import com.example.songr.classes.capitalize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller

public class GreetingsController {


        @GetMapping("/")
        @ResponseBody
        String home(){

            return "home";
        }

        @GetMapping("/hello")
        @ResponseBody
       public String greeting(){
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
    public String albums(Model model) {
            List<Albums> albumList = new ArrayList<>();


        albumList.add(new Albums(1 , 2545 , 454545 , "hamzeh" , "https://www.lazada.com.ph/products/the-secret-to-saving-building-your-future-book-financial-literacy-international-marketing-group-img-i355506973.html" , "hamzeh" ));
        albumList.add(new Albums(2 , 464 , 454545 , "hamzeh" , "url" , "hamzeh" ));
        albumList.add( new Albums(3 , 2545 , 454545 , "hamzeh" , "url" , "hamzeh" ));
//        Albums[] albums = {a, b, c};
        model.addAttribute("albums",albumList);
        //  System.out.println("hamzeh");
       return "albums";

        }
    }
//    @GetMapping("/albums")
//    public String albumShower(Model model) {
//        List<Albums> albumList = new ArrayList<>();
//        albumList.add(new Albums(2384, 8, "I'll Play the Blues for You", "https://img.discogs.com/B9A6naj2sCCjr7xb8jhhuxj5Kqs=/fit-in/600x598/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-2910864-1459939384-9401.jpeg.jpg","Hamzeh"));
////        albumList.add(new Albums("Rammstein", "Rammstein", 2780, 11, "https://upload.wikimedia.org/wikipedia/en/1/16/Rammstein_-_Rammstein.png"));
////        albumList.add(new Albums("a head full of dreams", "Coldplay", 2745, 11, "https://upload.wikimedia.org/wikipedia/en/3/3d/Coldplay_-_A_Head_Full_of_Dreams.png"));
//
//        model.addAttribute("albums", albumList);
//
//
//        return "albums";
//
//    }

