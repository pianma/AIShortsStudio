package com.ai.shortsstudio.apispec.adapter.in.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserAuthController {

    @GetMapping("/login")
    public ModelAndView home(ModelAndView model) {
        model.setViewName("user/login");
        return model;
    }
    @GetMapping("/signup")
    public ModelAndView signup(ModelAndView model) {
        model.setViewName("user/signup");
        return model;
    }

}
