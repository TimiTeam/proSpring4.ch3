package com.apress.prospring4.ch3.annotation;

import com.apress.prospring4.ch3.interfaces.Oracle;
import org.springframework.stereotype.Service;


@Service("oracle")
public class BookwormOracle implements Oracle {
    public String defineMeaningOfLife() {
        return "Encyclopedias are à waste of money - use the Internet";
    }
}
