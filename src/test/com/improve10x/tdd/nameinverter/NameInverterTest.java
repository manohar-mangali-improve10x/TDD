package com.improve10x.tdd.nameinverter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameInverterTest {
    @Test
    public void nothing(){

    }
    @Test
    public void givenEmpty_returnEmpty(){
        NameInverter nameInverter = new NameInverter();
        String invertedName = nameInverter.invertName("");
        assertEquals("",invertedName);
    }
}
