package br.com.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class IndexController {


    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView appInit() {
        ModelAndView mav = new ModelAndView("/index.html");
        return mav;
    }
}
