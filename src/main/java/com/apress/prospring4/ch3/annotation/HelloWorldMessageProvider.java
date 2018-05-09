package com.apress.prospring4.ch3.annotation;

import com.apress.prospring4.ch3.interfaces.MessageProvider;
import org.springframework.stereotype.Service;

//@Service("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider {
    public String getMessage() {
        return "Hello with Annotation, i think annotation is best!";
    }
}
