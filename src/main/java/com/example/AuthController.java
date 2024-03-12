package com.example;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/go-to-loginPage")
    public String goToLoginPage(Model model){
        return  "loginPage";

    }
    @GetMapping("/go-to-failed-loginPage")
    public String goToFailedLoginPage(Model model) {
        model.addAttribute("isError", true);
        return "loginPage";
    }


}
