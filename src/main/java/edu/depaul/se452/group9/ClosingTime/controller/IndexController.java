package edu.depaul.se452.group9.ClosingTime.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    String index(){
        return "index";
    }

    @GetMapping("/chat")
    String chat(){
        return "chat";
    }

    @GetMapping("/header")
    String header(){
        return "header";
    }

    @GetMapping("/buy")
    String buy(){
        return "buy";
    }

    @GetMapping("/favorites")
    String favorites(){
        return"favorites";
    }

    @GetMapping("/account")
    String account(){
        return "account";
    }
}

