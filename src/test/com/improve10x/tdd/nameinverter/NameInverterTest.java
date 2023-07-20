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

    @Test
    public void givenSingleWordWithTrialingSpace_returnSingleWord(){
        String invertedName = nameInverter.invertName("name  ");
        assertEquals("name",invertedName);
    }

    @Test
    public void givenSingleWordWithBeginningSpace_returnSingleWord(){
        String invertedName = nameInverter.invertName("   name  ");
        assertEquals("name",invertedName);
    }

    @Test
    public void givenFirstLast_returnInvertedName(){
        String invertedName = nameInverter.invertName("first last");
        assertEquals("last, first",invertedName);
    }

    @Test
    public void givenHonorifics_returnIgnoreHonorifics(){
        String invertedName = nameInverter.invertName("Mrs. first last");
        assertEquals("last, first",invertedName);
    }

    @Test
    public void givenMrHonorifics_returnIgnoreHonorifics(){
        String invertedName = nameInverter.invertName("Mr. first last");
        assertEquals("last, first",invertedName);
    }

    @Test
    public void givenPostNominal_stayAtEnd(){
        String invertedName = nameInverter.invertName("first last Msc.");
        assertEquals("last, first Msc.",invertedName);
    }

    @Test
    public void givenMultiPostNominal_stayAtEnd(){
        String invertedName = nameInverter.invertName("first last Msc. PhD.");
        assertEquals("last, first Msc. PhD.",invertedName);
    }
}
