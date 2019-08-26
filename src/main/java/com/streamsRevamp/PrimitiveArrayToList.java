package com.streamsRevamp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveArrayToList {
    public static void main(String[] args){
        int[] allnums = {1,2,4,5,6,77,8,9};
        List<Integer> allintshere = new ArrayList<>();
        for(int i: allnums){
            allintshere.add(i);
        };
        System.out.println(allintshere);

        IntStream numsIntStream = IntStream.range(100, 105);
        Stream<Integer> intStreamHere = numsIntStream.boxed();
        List<Integer> intList = intStreamHere.collect(Collectors.toList());
        System.out.println("JAVA8 streams -> " + intList);

        Stream<String> stringStreamHere = Stream.of("mikel", "monty", "jasper");
        stringStreamHere.forEach(System.out::println);

    };
}
