package com.streamsRevamp;

import com.samplePojos.Person;

import java.util.*;
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


        List<Person> persons = Arrays.asList(
                new Person("mikeljohn", 23),
                new Person("testperson", 34),
                new Person("johnson", 42),
                new Person("Kristen steweret", 25)
        );
        System.out.println(" --Person OBJ -- " + getStudentByName(persons, "johnson"));


        Person resultPerson8 = persons.stream()
                .filter(per -> "johnson".equalsIgnoreCase(per.getName()))
                .findAny()
                .orElse(null);
        System.out.println(" -- resultPerson8 -- " + resultPerson8);


//        filter() and map()
        System.out.println("--- streams = filter() // map() // forEach() ---");

        List<Person> personlstHere = Arrays.asList(
                new Person("utahman", 22),
                new Person("houstonman", 25),
                new Person("austinman", 43),
                new Person("floridaman", 33)
        );

        List<String> mountainMan = personlstHere.stream()
                .map(person -> person.getName())
                .collect(Collectors.toList());

        System.out.println(mountainMan.stream().map(ele -> ele.toUpperCase()).collect(Collectors.toList()));

        List<Person> filterdMan = personlstHere.stream()
                .filter(person -> "utahman".equalsIgnoreCase(person.getName()) ||
                "austinman".equalsIgnoreCase(person.getName()))
                .collect(Collectors.toList());
        filterdMan.stream().forEach(per -> System.out.println(per.getName().toUpperCase()));

        System.out.println("-------------------------------");


        Map<String, Number> somVal = new HashMap<>();
        somVal.put("A", 1121);
        somVal.put("B", 1122);
        somVal.put("C", 1123);
        somVal.put("D", 1124);
        somVal.put("E", 1125);
        somVal.forEach((m,n) -> {
            if ("C".equalsIgnoreCase(m)) {
                System.out.println(" Hello =C=");
                somVal.replace("C", 1111);
            }
        });
        somVal.forEach((m,n) -> System.out.println(m + " " + n));

    }



//    METHODS
    private static List<String> getFilterdFrameworklist(List<String> fwList, String filter) {
        List<String> resultLst = new ArrayList<>();
        for(String fw : fwList) {
            if (!fw.equals(filter)) {
                resultLst.add(fw);
            }
        }
        return resultLst;
    }

    private static Person getStudentByName(List<Person> persons, String personFilter) {
        Person resultPErson = null;
        for (Person person : persons) {
            if (personFilter.equalsIgnoreCase(person.getName())) {
                resultPErson = person;
            }
        }
        return resultPErson;
    }


}
