package controllar;

import Repository.REPO;
import classes.Albums;
import classes.capitalize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;
//@RequestParam(name = "name" , defaultValue = "World" , required = false) String name , Model model
@Controller
public class main {

    @Autowired
    REPO Repo;


    @GetMapping("/album")
    public String albums(Model model){


        List<Albums> albums = (List<Albums>) Repo.findAll();
        model.addAttribute("albums", albums);
        return "done";
    }


    @PostMapping("/add/album")
    public RedirectView postAlbum(@RequestParam int length,
                                  @RequestParam int songCount,
                                  @RequestParam String title,
                                  @RequestParam String imageUrl,
                                  @RequestParam String artist
    ){
        Albums albums = Repo.save(new Albums(length , songCount , title , imageUrl ,artist));
        return new RedirectView("/albums");
    }



    @GetMapping("albums/{id}")
    public ResponseEntity<Albums> getOneAlbum(@PathVariable Long id){
        Albums returnedAlbum = Repo.findById(id).orElseThrow();
        return new ResponseEntity<>(returnedAlbum, HttpStatus.OK);
    }


//    @GetMapping("/hello")
//    @ResponseBody
//    public String hello (){
//        Albums albums = new Albums(5 , 5 , "hamzeh" , "url" , "hamzeh");
//        model.addAttribute("name",name);
//        Repo.save(albums);
//        return "helloWorld";
//    }

    @GetMapping("/capitalize/{hello}")
    public String capitalize(@PathVariable String hello, Model model) {
        String capital = capitalize.wordCapital(hello);
        model.addAttribute("word", capital);
        return "capitalized";
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
    @GetMapping("/myInfo")
    public String userInfoGetter(@RequestHeader MultiValueMap<String, String> headers, Model model) {
        headers.forEach((key, value) -> System.out.println(String.format("Header '%s' = %s", key, String.join("|", value))));
        model.addAttribute("headerData",headers.get("user-agent"));
        return "userInfo";
    }
}

