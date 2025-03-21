package com.ai.shortsstudio.apispec.adapter.in;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Sample {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "자동 배포 테스트";
    }

}
