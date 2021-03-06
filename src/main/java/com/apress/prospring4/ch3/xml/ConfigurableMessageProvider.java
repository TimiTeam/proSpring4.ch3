package com.apress.prospring4.ch3.xml;

import com.apress.prospring4.ch3.interfaces.MessageProvider;

/**
 * Created by admin on 09.05.2018.
 */
public class ConfigurableMessageProvider implements MessageProvider {
    private String message = "Default message";

    public ConfigurableMessageProvider() {
    }

    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
