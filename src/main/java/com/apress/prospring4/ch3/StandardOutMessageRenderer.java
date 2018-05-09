package com.apress.prospring4.ch3;

import com.apress.prospring4.ch3.interfaces.MessageProvider;
import com.apress.prospring4.ch3.interfaces.MessageRenderer;

public class StandardOutMessageRenderer implements MessageRenderer{

    private MessageProvider messageProvider;

    public String render() {
        if(messageProvider == null){
            throw new RuntimeException(
                    "You must set the property messageProvider of class"+
                            StandardOutMessageRenderer.class.getName()
            );
        }
        return messageProvider.getMessage();
    }

    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    public MessageProvider getMessageProvider() {
        return messageProvider;
    }
}
