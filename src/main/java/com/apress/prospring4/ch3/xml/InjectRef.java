package com.apress.prospring4.ch3.xml;


import com.apress.prospring4.ch3.interfaces.Oracle;

public class InjectRef {
    private Oracle oracle;

    public void setOracle(Oracle oracle) {
        this.oracle = oracle;
    }

    @Override
    public String toString() {
        return "InjectRef{" +
                "oracle=" + oracle.defineMeaningOfLife() +
                '}';
    }
}
