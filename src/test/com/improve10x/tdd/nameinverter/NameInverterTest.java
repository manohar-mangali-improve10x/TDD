package com.improve10x.tdd.nameinverter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameInverterTest {
    private NameInverter nameInverter;
    @BeforeEach
    public void setup(){
        nameInverter = new NameInverter();
    }
    @Test
    public void nothing(){

    }
    @Test
    public void givenEmpty_returnEmpty(){
        String invertedName = nameInverter.invertName("");
        assertEquals("",invertedName);
    }

    @Test
    public void givenName_returnName(){
        String invertedName = nameInverter.invertName("name");
        assertEquals("name",invertedName);
    }
}
