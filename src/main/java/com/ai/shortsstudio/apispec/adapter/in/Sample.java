package com.ai.shortsstudio.apispec.adapter.in;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Sample {

    @GetMapping("/")
    @ResponseBody
    public ModelAndView home(ModelAndView model) {
        model.setViewName("/index");
        return model;
    }

}
