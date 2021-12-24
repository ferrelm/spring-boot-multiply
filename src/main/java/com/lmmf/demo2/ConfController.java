package com.lmmf.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("configuration")
public class ConfController {

    @Autowired
    private Conf confService;

    @GetMapping
    public Conf getConf() {
        return confService;
    }

}
