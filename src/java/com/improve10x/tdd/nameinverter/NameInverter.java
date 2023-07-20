package com.improve10x.tdd.nameinverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NameInverter {
    public String invertName(String name) {
        if (name.equals("")){
            return "";
        } else if (!name.trim().contains(" ")) {
            return name.trim();
        }else {
            return formatMultiElementsName(name);
        }
    }

    private static String formatMultiElementsName(String name) {
        ArrayList<String> names =new ArrayList<>(Arrays.asList(name.trim().split("\\s+")));
        removeHonorifics(names);
        String postNominal = getPostNominal(names.subList(2,names.size()));
        return names.get(1) + ", " + names.get(0) + " " + postNominal.trim();
    }

    private static String getPostNominal(List<String> postNominalList) {
        String postNominal = "";
            for (int i = 0; i < postNominalList.size(); i++) {
                postNominal += postNominalList.get(i) + " ";
            }
        return postNominal;
    }

    private static void removeHonorifics(ArrayList<String> names) {
        if (hasHonorifics(names) && names.size() >  2){
            names.remove(0);
        }
    }

    private static boolean hasHonorifics(ArrayList<String> names) {
        return names.get(0).matches("Mrs.|Mr.|Miss.");
    }
}
