package com.apress.prospring4.ch3.annotation;

import com.apress.prospring4.ch3.interfaces.MessageProvider;
import com.apress.prospring4.ch3.interfaces.MessageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("messageRender")
public class StandardOutMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider;

    public String render() {
        if(messageProvider ==null){
            throw new RuntimeException(
                    "You need set the Message Provider in your class: "+
                            StandardOutMessageRenderer.class.getName()
            );
        }

        return messageProvider.getMessage();
    }

    @Autowired // Set Injection using annotation
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    public MessageProvider getMessageProvider() {
        return messageProvider;
    }
}
