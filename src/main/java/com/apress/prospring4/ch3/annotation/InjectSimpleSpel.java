package com.apress.prospring4.ch3.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("injectSimpleSpel")
public class InjectSimpleSpel {

    @Value("#{injectSimpleConfig.name}")
    private String name;

    @Value("#{injectSimpleConfig.age}")
    private int age;

    @Value("#{injectSimpleConfig.height}")
    private float heightf;

    @Value("#{injectSimpleConfig.programmer}")
    private boolean programmer;

    @Value("#{injectSimpleConfig.ageinSeconds}")
    private Long ageinSeconds;


    @Override
    public String toString() {
        return "InjectSimpleSpel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", heightf=" + heightf +
                ", programmer=" + programmer +
                ", ageinSeconds=" + ageinSeconds +
                '}';
    }
}
