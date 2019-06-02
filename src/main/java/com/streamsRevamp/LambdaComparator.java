package com.streamsRevamp;

import com.samplePojos.Developer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaComparator {
    public static void main(String[] args) {
        List<Developer> developers = getDevelopersList();

        System.out.println("=====before sort====");
        for(Developer developer: developers) {
            System.out.println(developer);
        }

        // sort by age
        Collections.sort(developers, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println("-----sort by age----");
        for(Developer developer: developers) {
            System.out.println(developer);
        }

        // sort by name
        Collections.sort(developers, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getDeveloperName().compareTo(o2.getDeveloperName());
            }
        });
        System.out.println("-----sort by name----");
        developers.stream().forEach(developer -> System.out.println(developer));

        // sort by salary
        Collections.sort(developers, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getDeveloperSal().compareTo(o2.getDeveloperSal());
            }
        });
        System.out.println("-----sort by salary----");
        developers.stream().forEach(developer -> System.out.println(developer));


        // In java8 List interface directly supports sort, No need to use Colletions.sort()
        System.out.println("----JAVA8 list storting----");
        developers.sort(new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        developers.stream().forEach(ele -> System.out.println(ele));

        // lambda way
        developers.sort(Comparator.comparing(Developer::getDeveloperName));
        developers.stream().forEach(deve -> System.out.println(deve));

        developers.sort(Comparator.comparing(Developer::getDeveloperSal));
        developers.stream().forEach(devel -> System.out.println(devel));

    }

    private static List<Developer> getDevelopersList() {
        List<Developer> developersList = new ArrayList();
        developersList.add(new Developer("helvetica parson", new BigDecimal("7000"), 35));
        developersList.add(new Developer("Bellamy", new BigDecimal("8000"), 38));
        developersList.add(new Developer("mikelKors", new BigDecimal("6000"), 30));
        developersList.add(new Developer("sansSherif", new BigDecimal("4000"), 25));
        return developersList;
    }
}
