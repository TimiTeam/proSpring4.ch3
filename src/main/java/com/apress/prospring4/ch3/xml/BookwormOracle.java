package com.apress.prospring4.ch3.xml;

import com.apress.prospring4.ch3.interfaces.Oracle;


public class BookwormOracle implements Oracle{
    public String defineMeaningOfLife() {
        return "Encyclopedias are a water of money - use the Internet";
    }
}
