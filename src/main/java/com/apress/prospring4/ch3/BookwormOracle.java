package com.apress.prospring4.ch3;

import com.apress.prospring4.ch3.interfaces.Oracle;


public class BookwormOracle implements Oracle{
    public String defineMeaningOfLife() {
        return "Encyclopedias are à waste of money - use the Internet";
    }
}
