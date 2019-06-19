package com.streamsRevamp;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SmartCollection {
    public static void main(String... args) {


        // Example to Sort a Map using JAVA streams
        Map<String, Integer> unsortedMap = getUnsortedMap();
        System.out.println(" --unsortedMap-- " + unsortedMap);
        LinkedHashMap<String, Integer> sortedMap = unsortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValuew, newValue) -> oldValuew,  LinkedHashMap::new ));
        System.out.println(" --sortedMap-- " + sortedMap);



        String[] array = {"a", "b", "c", "d", "e"};
        Supplier<Stream<String>> stream = () -> Stream.of(array);

        // loop a stream
        stream.get().forEach(x -> System.out.println(x));

        // reuse it to filter again! throws IllegalStateException
        List<String> count = stream.get().filter(x -> "b".equals(x)).collect(Collectors.toList());
        System.out.println(count);


    }



    // Support Methods
    private static Map<String, Integer> getUnsortedMap() {
        System.out.println("-- Entering method getUnsortedMap --");
        Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("a", 6);
        unsortMap.put("c", 20);
        unsortMap.put("d", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("n", 99);
        unsortMap.put("g", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 9);
        System.out.println("-- Exiting method getUnsortedMap --");
        return unsortMap;
    }

    // arrays to streams conversion
    private static void arrToStrmConverter() {
        System.out.println("-- Entering method arrToStrmConverter --");
        // Object type
        String[] strArr = {"a", "b", "c", "d", "e"};
        Stream<String> strStream1 = Arrays.stream(strArr);
        Stream<String> strStream2 = Stream.of(strArr);
        strStream1.forEach(e -> System.out.println(e));


        // primitive type
        int[] intArray = {1, 2, 3, 4, 5};
        IntStream arrStream1 = Arrays.stream(intArray);
        arrStream1.forEach(e -> System.out.println(e));
        System.out.println("-- Exiting method arrToStrmConverter --");
    }



}
