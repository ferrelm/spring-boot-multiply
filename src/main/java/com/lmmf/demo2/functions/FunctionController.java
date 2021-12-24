package com.lmmf.demo2.functions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/functions")
public class FunctionController {

    @Autowired
    private FunctionService funcService;

    @GetMapping
    public FunctionService getFunc() {
        return funcService;
    }

}
