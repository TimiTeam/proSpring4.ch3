package com.apress.prospring4.ch3;

import com.apress.prospring4.ch3.interfaces.MessageProvider;

/**
 * Created by admin on 09.05.2018.
 */
public class ConfigurableMessageProvider implements MessageProvider {
    private String message;

    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
