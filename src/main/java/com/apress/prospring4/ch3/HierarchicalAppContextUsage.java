package com.apress.prospring4.ch3;

import com.apress.prospring4.ch3.xml.CollectionInjection;
import com.apress.prospring4.ch3.xml.SimpleTarget;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class HierarchicalAppContextUsage {

    private static final Logger LOGGER = Logger.getLogger(HierarchicalAppContextUsage.class);

    public static void main(String[] args) {

        GenericXmlApplicationContext parent = new GenericXmlApplicationContext("parent.xml");
        // Using GenericXMLApplicationContext to be able to set the parent XML

        GenericXmlApplicationContext child = new GenericXmlApplicationContext();
        child.setParent(parent); // setting parent XML
        child.load("xml-bean-factory-config.xml"); // and then set the path to XML file
        child.refresh();

//        SimpleTarget target1 = child.getBean("target1",SimpleTarget.class);
//        LOGGER.info(target1.getValue());
//
//        SimpleTarget target2 = child.getBean("target2",SimpleTarget.class);
//        LOGGER.info(target2.getValue());
//
//        SimpleTarget target3 = child.getBean("target3",SimpleTarget.class);
//        LOGGER.info(target3.getValue());

        CollectionInjection injection = child.getBean("injectCollection",CollectionInjection.class);
        LOGGER.info(injection.toString());




    }
}
