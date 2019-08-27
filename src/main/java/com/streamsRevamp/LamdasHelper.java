package com.streamsRevamp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LamdasHelper {
    public static void main(String[] args){

        getStringStream().forEach(System.out::println);
        primitiveIntArrHandler(new int[]{2, 3, 4, 55, 66, 77, 8, 99}).stream().forEach(System.out::println);
        charArrayHandler().forEach(System.out::println);
    };


//  primitive array to list
    private static List<Integer> primitiveIntArrHandler(int[] primitiveArr) {
        System.out.println("Entering method primitiveIntArrHandler");
        List<Integer> intList = new ArrayList<Integer>();
        if (primitiveArr != null && primitiveArr.length > 0) {
            for (int numm : primitiveArr) {
                intList.add(numm);
            };
            return intList;
        } else {
            IntStream intStreamEle = IntStream.range(100, 105);
            Stream<Integer> intArrStream = intStreamEle.boxed();
            return intArrStream.collect(Collectors.toList());
        }
    };

//Stream of strings
    private static Stream<String> getStringStream() {
        System.out.println("Entering method getStringStream");
        return Stream.of("Bellamy", "Clarke", "Jasper", "Jonnathan", "will");
    };

//    String to char array
    private static Stream<Character> charArrayHandler() {
        System.out.println("Entering method charArrayHandler");
        String liveplace = "Round Rock";
        System.out.println(liveplace.toCharArray());

        String movieName = "Stranger Things";
        IntStream movieNmChars = movieName.chars();
        Stream<Character> streamChar = movieNmChars.mapToObj(c -> (char) c);
        return streamChar;
    }
}
