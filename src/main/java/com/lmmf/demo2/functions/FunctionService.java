package com.lmmf.demo2.functions;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {

    public double getMult() {
        Function func = new Function(2.0, 3.0);
        return func.getMult();
    }
}
