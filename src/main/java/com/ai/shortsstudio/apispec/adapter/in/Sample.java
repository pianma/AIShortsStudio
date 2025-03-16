package com.ai.shortsstudio.apispec.adapter.in;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Sample {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }

}
