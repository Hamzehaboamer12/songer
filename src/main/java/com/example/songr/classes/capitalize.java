package com.example.songr.classes;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Locale;

public class capitalize {

    public static String wordCapital(String word){

        return word.toUpperCase(Locale.ROOT);
    }


}
