package com.streamsRevamp;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LamdasHelper {
    public static void main(String[] args){

        getStringStream().forEach(System.out::println);
        primitiveIntArrHandler(new int[]{2, 3, 4, 55, 66, 77, 8, 99}).stream().forEach(System.out::println);
        charArrayHandler().forEach(System.out::println);

        String[] actors1 = new String[] {"Mikel", "bellamy", "clarke", "monty"};
        String[] actors2 = new String[] {"jasper", "will", "lisa", "nancy"};
        joinStringArrs(actors1, actors2);
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

//    Joining arrays
    private static void joinStringArrs(String[] strarr1, String[] strarr2 ) {
        System.out.println("Entering method joinStringArrs");
        String[] strArrReult1 = ArrayUtils.addAll(strarr1, strarr2);
        System.out.println(Arrays.toString(strArrReult1));

        String[] s1 = new String[]{"a", "b", "c"};
        String[] s2 = new String[]{"d", "e", "f"};
        String[] s3 = new String[]{"g", "h", "i"};
        // Stream.of(s1, s2, s3).flatMap(Stream::of).toArray(String[]::new);
        String[] s4 = Arrays.asList(s1, s2, s3).stream().flatMap(ele -> Stream.of(ele)).toArray(String[]::new);
        System.out.println(Arrays.toString(s4));

    };
}
