package com.apress.prospring4.ch3;

import com.apress.prospring4.ch3.interfaces.MessageProvider;

/**
 * Created by admin on 09.05.2018.
 */
public class HelloWorld�essageProvider implements MessageProvider {
    public String getMessage() {
        return "Hello World! My name Timur, and I study Spring";
    }
}
