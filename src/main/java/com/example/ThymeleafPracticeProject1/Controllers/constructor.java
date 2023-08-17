package com.example.ThymeleafPracticeProject1.Controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Amresh Tripathy
 */

@RestController
public class constructor {

    @GetMapping("/about")
    public String getAbout(Model model) {
        model.addAttribute("name","Amresh");
        return "about amresh";
    }
}
