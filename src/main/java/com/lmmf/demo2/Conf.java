package com.lmmf.demo2;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "basic")
public class Conf {

    private int aNumber;
    private String aString;
    private boolean aBoolean;

    public void setaNumber(int aNumber) {
        this.aNumber = aNumber;
    }

    public int getaNumber() {
        return aNumber;
    }

    public void setaString(String aString) {
        this.aString = aString;
    }

    public String getaString() {
        return aString;
    }

    public void setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public boolean getaBoolean() {
        return aBoolean;
    }

}
