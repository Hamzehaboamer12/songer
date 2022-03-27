package controllar;

import Repository.REPO;
import Repository.SongRepository;
import classes.Albums;
import classes.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.persistence.Id;

@Controller
public class songController {

    @Autowired
    private REPO Repo;

    @Autowired
    private SongRepository songRepository;

    @PostMapping("/addSong")

    public RedirectView addNewSong(String title , float length, int trackNumber , Long id){
        Albums album = Repo.findById(id).orElseThrow();
        Song song = new Song(title,length,trackNumber,album);
        songRepository.save(song);

        return new RedirectView("/albums/"+id+"/songs");
    }

    @GetMapping("/songs")
    @ResponseBody


    public String getAllSongs(Model model){

        model.addAttribute("songs", songRepository.findAll());
        return "songs";
    }
}

