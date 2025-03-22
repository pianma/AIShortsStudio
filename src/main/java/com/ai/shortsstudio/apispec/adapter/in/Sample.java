package com.ai.shortsstudio.apispec.adapter.in;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Sample {

    @GetMapping("/login")
    public ModelAndView home(ModelAndView model) {
        model.setViewName("/auth/login");
        return model;
    }
    @GetMapping("/signup")
    public ModelAndView signup(ModelAndView model) {
        model.setViewName("/auth/signup");
        return model;
    }

}
