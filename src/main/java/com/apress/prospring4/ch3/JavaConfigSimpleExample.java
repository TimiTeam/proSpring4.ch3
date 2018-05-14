package com.apress.prospring4.ch3;

import com.apress.prospring4.ch3.conf.AppConfig;
import com.apress.prospring4.ch3.interfaces.MessageRenderer;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by admin on 15.05.2018.
 */
public class JavaConfigSimpleExample {

    private static final Logger LOGGER = Logger.getLogger(JavaConfigSimpleExample.class);

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //This class using for getting bean from Java Config classes

        MessageRenderer renderer = context.getBean("messageRenderer",MessageRenderer.class);
        LOGGER.info(renderer.render());

    }
}
