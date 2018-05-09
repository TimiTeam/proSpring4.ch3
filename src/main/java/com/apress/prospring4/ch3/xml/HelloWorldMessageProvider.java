package com.apress.prospring4.ch3.xml;

import com.apress.prospring4.ch3.interfaces.MessageProvider;


public class HelloWorldMessageProvider implements MessageProvider {
    public String getMessage() {
        return "Hello World! My name Timur, and I study Spring";
    }
}
