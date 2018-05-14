package com.apress.prospring4.ch3.conf;

import com.apress.prospring4.ch3.interfaces.MessageProvider;
import com.apress.prospring4.ch3.interfaces.MessageRenderer;
import com.apress.prospring4.ch3.xml.ConfigurableMessageProvider;
import com.apress.prospring4.ch3.xml.StandardOutMessageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//Creating Configuration Java-Class
// this annotation tell us that this is a configuration class
@Configuration
//This annotation - this loads the values from the file
// and then inject their in to the properties MessageProvider
@PropertySource(value="classpath:message.properties")
//The configuration class will look for the components in this package
@ComponentScan(basePackages = {"com.apress.prospring4.ch3"})
@EnableTransactionManagement
public class AppConfig {

    @Autowired
    Environment environment;


    //Its simple bean
    @Bean
    //@Lazy tell us that the bean will be created when it is requested
    public MessageProvider messageProvider(){
        return new ConfigurableMessageProvider(environment.getProperty("message"));
    }


    @Bean(name = "messageRenderer")
    @Scope(value = "prototype")
    //Dependency injection by Java config on 'messageProvider'
    @DependsOn(value = "messageProvider")
    public MessageRenderer messageRenderer(){
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(messageProvider());
        return renderer;
    }
}
