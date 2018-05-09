package com.apress.prospring4.ch3;


import com.apress.prospring4.ch3.annotation.InjectSimpleConfig;
import com.apress.prospring4.ch3.interfaces.MessageProvider;
import com.apress.prospring4.ch3.annotation.InjectSimpleSpel;
import com.apress.prospring4.ch3.interfaces.MessageRenderer;
import com.apress.prospring4.ch3.xml.InjectRef;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeclareSpringComponents {
    private static final Logger LOGGER = Logger.getLogger(DeclareSpringComponents.class);

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("app-context-annotation.xml");

        ApplicationContext contextFromXml =
                new ClassPathXmlApplicationContext("xml-bean-factory-config.xml");

        MessageRenderer renderer = context.getBean("messageRender", MessageRenderer.class);
        LOGGER.info(renderer.getMessageProvider().getMessage());

        MessageRenderer renderer1XML = contextFromXml.getBean("messageRender", MessageRenderer.class);
        LOGGER.info(renderer1XML.getMessageProvider().getMessage());

//        InjectSimpleSpel spelXML = contextFromXml.getBean("injectSimpleSpel",InjectSimpleSpel.class);
//        LOGGER.info("Object by XML config: "+spelXML.toString());

//        InjectSimpleSpel spel = context.getBean("injectSimpleSpel",InjectSimpleSpel.class);
//        LOGGER.info("Object by annotation config: "+spel.toString());

        InjectRef injectRefXML =  contextFromXml.getBean("injectRef",InjectRef.class);
        LOGGER.info(injectRefXML.toString());
    }
}
