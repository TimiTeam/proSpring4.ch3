package com.apress.prospring4.ch3.conf;


import com.apress.prospring4.ch3.xml.BookwormOracle;
import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfigWithBeanFactory {
    private static final Logger logger = Logger.getLogger(XmlConfigWithBeanFactory.class);

    public static void main(String[] args) {

        AbstractApplicationContext context = new
                ClassPathXmlApplicationContext("xml-bean-factory-config.xml");

        BookwormOracle oracle = context.getBean("oracle",BookwormOracle.class);

        logger.info(oracle.defineMeaningOfLife());

    }
}
