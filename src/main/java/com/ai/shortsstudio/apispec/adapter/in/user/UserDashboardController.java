package com.ai.shortsstudio.apispec.adapter.in.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserDashboardController {

    @GetMapping("/user/dashboard")
    public ModelAndView userDashboard(ModelAndView model) {
        model.setViewName("user/dashboard");
        return model;
    }

}
