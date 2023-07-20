package com.improve10x.tdd.nameinverter;

public class NameInverter {
    public String invertName(String name) {
        if (name.equals("")){
            return "";
        } else if (!name.contains(" ")) {
            return name;

        }
        return null;
    }
}
