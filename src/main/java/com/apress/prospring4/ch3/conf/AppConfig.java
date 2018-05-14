package com.apress.prospring4.ch3.conf;

import com.apress.prospring4.ch3.interfaces.MessageProvider;
import com.apress.prospring4.ch3.interfaces.MessageRenderer;
import com.apress.prospring4.ch3.xml.ConfigurableMessageProvider;
import com.apress.prospring4.ch3.xml.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Creating Configuration Java-Class
// This annotation tell us that this is a configuration class
@Configuration
public class AppConfig {

    //Its simple bean
    @Bean
    public MessageProvider messageProvider(){
        return new ConfigurableMessageProvider();
    }

    //Dependency injection by Java config
    @Bean
    public MessageRenderer messageRenderer(){
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(messageProvider());
        return renderer;
    }
}
