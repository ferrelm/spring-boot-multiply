package com.lmmf.demo2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo2Controller {

    @Value("${welcome.message}")
    private String welcomeMessage;

    @GetMapping("/")
    public String retrieveWelcomeMessage() {
        return welcomeMessage;
    }

}
