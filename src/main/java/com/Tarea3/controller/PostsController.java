package com.Tarea3.controller;


import com.Tarea3.service.PublicacionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class PostsController {
    
    @Autowired
    private PublicacionService publicacionService;
    
    @GetMapping("/Review.html")
    public String publicaciones (Model model){
        /*
        var postsDB = publicacionService.getPublicacion();
        model.addAttribute("postsDB", postsDB);
        */
        return "reviews";
    }
}
