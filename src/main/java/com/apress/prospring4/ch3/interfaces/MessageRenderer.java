package com.apress.prospring4.ch3.interfaces;


public interface MessageRenderer {

    String render ();

    void setMessageProvider(MessageProvider provider);

    MessageProvider getMessageProvider();
}
