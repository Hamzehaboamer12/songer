package com.example.songr.controllar;

import com.example.songr.classes.Albums;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class main {

//    @GetMapping("/albums")
//    public String albums(Model model) {
       // Albums a = new Albums(5, 10, "frank sinatra", "https://wikiimg.tojsiabtv.com/wikipedia/en/thumb/b/b2/My_Way_-_Frank_Sinatra.jpg/1280px-My_Way_-_Frank_Sinatra.jpg" , "hamzeh");

       // Albums b = new Albums(2, 1215, 10, "Dance Me to the End of Love", "https://images.genius.com/8c656d9d4459e272aad62ec1a38a78bc.600x600x1.jpg" , "hamzeh");
        //Albums c = new Albums("Mambo Italiano", "Dean Martin", 10, 454545, "https://i.kfs.io/album/global/146838483,0v1/fit/500x500.jpg" , "hamzeh");
//         Albums a = new Albums(1 , 2545 , 454545 , "hamzeh" , "url" , "hamzeh" );
//        Albums b = new Albums(2 , 464 , 454545 , "hamzeh" , "url" , "hamzeh" );
//        Albums c = new Albums(3 , 2545 , 454545 , "hamzeh" , "url" , "hamzeh" );
//        Albums[] albums = {a, b, c};
//        model.addAttribute("albums", albums);
      //  System.out.println("hamzeh");
//        return "albums";
//    }


//    @GetMapping("/hello")
//    public String hello (@RequestParam(name = "name" , defaultValue = "World" , required = false) String name , Model model){
//        model.addAttribute("name",name);
//        return "helloWorld";
//    }
//
//    @GetMapping("/capitalize/{hello}")
//    public String capitalize(@PathVariable String hello, Model model) {
//        String capital = capitalize.wordCapital(hello);
//        model.addAttribute("word", capital);
//        return "capitalized";
//    }
//
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
//    @GetMapping("/myInfo")
//    public String userInfoGetter(@RequestHeader MultiValueMap<String, String> headers, Model model) {
//        headers.forEach((key, value) -> System.out.println(String.format("Header '%s' = %s", key, String.join("|", value))));
//        model.addAttribute("headerData",headers.get("user-agent"));
//        return "userInfo";
//    }
}
