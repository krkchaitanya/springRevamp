package com.streamsRevamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NowJava8 {

    public static void main(String[] args) {
        List<String> frameworksList = Arrays.asList("spring", "node", "react", "jquery");

//        Older way
        List<String> resp = getFilterdFrameworklist(frameworksList, "jquery");
        for (String fw : resp) {
            System.out.println(" - " + fw);
        }

//        using stream
        List<String> streamLst = frameworksList.stream()
                .filter(fw -> !("jquery".equals(fw)))
                .collect(Collectors.toList());
        streamLst.forEach(ele -> System.out.println(ele));
    }


    private static List<String> getFilterdFrameworklist(List<String> fwList, String filter) {
        List<String> resultLst = new ArrayList<>();
        for(String fw : fwList) {
            if (!fw.equals(filter)) {
                resultLst.add(fw);
            }
        }
        return resultLst;
    }


}
