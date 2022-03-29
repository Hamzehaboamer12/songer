package com.example.songr.controllar;

import com.example.songr.Repository.REPO;
import com.example.songr.classes.Albums;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
//@RequestParam(name = "name" , defaultValue = "World" , required = false) String name , Model model
@Controller
public class main {

    @Autowired
    REPO Repo;


    @RequestMapping( value = "/")
    public String home()
    {
        return"home";
    }

    @RequestMapping( value = "/hello")
    public String hello()
    {
        return"hello";
    }




    @RequestMapping(value = "/UpperCase/{text}")

    public String uppercase(@PathVariable String text , Model model){

        model.addAttribute("text" , text.toUpperCase());
        return "UpperCase";

    }

    @GetMapping("/albums")

    public String albums(Model model){


        List<Albums> albums = (List<Albums>) Repo.findAll();
        model.addAttribute("albums", albums);
        return "albums";
    }


    @PostMapping("/add/album")
    public RedirectView ShowAlbums(@RequestParam int length,
                                  @RequestParam int songCount,
                                  @RequestParam String title,
                                  @RequestParam String imageUrl,
                                  @RequestParam String artist
    ){
        Albums albums = Repo.save(new Albums(length , songCount , title , imageUrl ,artist));
        return new RedirectView("/albums");
    }



    @RequestMapping(value = "albums/{id}")
    public ResponseEntity<Albums> getAlbum(@PathVariable Long id){
        Albums returnedAlbum = Repo.findById(id).orElseThrow();
        return new ResponseEntity<>(returnedAlbum, HttpStatus.OK);
    }





}

