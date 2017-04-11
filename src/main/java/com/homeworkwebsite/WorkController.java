package com.homeworkwebsite;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.Random;

/**
 * Created by chrisaanerud on 4/11/17.
 */
@Controller
public class WorkController {
    @RequestMapping("/quitplayinggameswithmyheart")
    public String homeworkRocks (Model model){

            Random random = new Random();
            model.addAttribute("trueorfalse",random.nextBoolean());
            model.addAttribute("number", random.nextInt(1000));
            model.addAttribute("time", LocalDateTime.now());

        return "homework";
    }
}
