package com.streamsRevamp;

import com.samplePojos.Person;

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
