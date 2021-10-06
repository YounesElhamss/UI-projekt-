package com.example.uiprojekt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String getFrontPage() {
        return "index";
    }

    @GetMapping("/login")
    public String getLoginPage() {
        return "login";
    }

    @GetMapping("/signup")
    public String getSignUpPage() {
        return "signup";
    }
    @GetMapping("/about")
    public String getAboutPage() {
        return "about";
    }

    @GetMapping("/organization")
    public String getOrganizationLoginPage() {
        return "organization";
    }

    @GetMapping("/private")
    public String getPrivateLoginPage() {
        return "private";
    }

    @GetMapping("/business")
    public String getBusinessLoginPage() {
        return "business";
    }

    @GetMapping("/frontpageBusiness")
    public String getFrontpageBusiness() {
        return "frontpageBusiness";
    }

    @GetMapping("/frontpageOrg")
    public String getFrontpageOrg() {
        return "frontpageOrg";
    }

    @GetMapping("/frontpagePrivate")
    public String getFrontpagePrivate() {
        return "frontpagePrivate";
    }


    //blablablabla GIT TEST

    @GetMapping("/frontpagePrivate")
    public String getFrontpagePrivate2() {
        return "frontpagePrivate";
    }
}