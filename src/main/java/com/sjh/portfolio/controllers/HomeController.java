package com.sjh.portfolio.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller(value = "com.sjh.portfolio.controllers.HomeController")
@RequestMapping(value = "/")

public class HomeController {
    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public ModelAndView getHome(){


        ModelAndView modelAndView=new ModelAndView("/home");


        return modelAndView;
    }


}
