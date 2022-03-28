package com.example.songr.controllar;

import Repo.Repo;
import com.example.songr.classes.Albums;
import com.example.songr.classes.capitalize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller

public class GreetingsController {


    @GetMapping("/")
    public String home()
    {
        return"home";
    }

    @GetMapping("/hello")
    public String hello()
    {
        return"hello";
    }




    @GetMapping("/UpperCase/{text}")

      public String uppercase(@PathVariable String text , Model model){

        model.addAttribute("text" , text.toUpperCase());
        return "UpperCase";

    }

    @GetMapping("/albums")
    public String albums(Model model){

         Albums albumOne =new Albums(1 , 10 ,50 , "hamzeh" , "https://c.saavncdn.com/255/Black-Punjabi-2019-20191127024538-500x500.jpg" , "hamzeh" );
        Albums albumTwo =new Albums(2, 20 ,90 , "hamzeh" , "https://i0.wp.com/ytimg.googleusercontent.com/vi/zTfAX0_1zCw/hqdefault.jpg?resize=60,60" , "hamzeh" );
        Albums albumThree =new Albums(3 , 51 ,40 , "hamzeh" , "http://static.keymusic.com/products/11042/XL/hal-leonard-metallica-the-black-album.jpg" , "hamzeh" );
        Albums[] albums = {albumOne , albumTwo , albumThree};

        model.addAttribute("albums" , albums);

        return "albums";


    }





}

