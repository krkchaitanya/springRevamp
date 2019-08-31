package com.streamsRevamp;

import org.apache.commons.lang3.ArrayUtils;

import java.util.*;
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
        generateRandomNumsInRange(20,25);
        findElements();
        validateArrElems();
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
            // boxed() is an intermediate operation which invokes on stream instance and produces the stream instance as output.
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
        // flatmap() - combination of a map and a flat operation == ie:Stream of List of <<Data Type>>  to  Stream of <<Data Type>>
        // Stream.of(s1, s2, s3).flatMap(Stream::of).toArray(String[]::new);
        String[] s4 = Arrays.asList(s1, s2, s3).stream().flatMap(ele -> Stream.of(ele)).toArray(String[]::new);
        System.out.println(Arrays.toString(s4));

        // Converting array to streams
        String[] seriesBucketList = new String[] {"Stranger things", "the100", "13 reasons why", "last IO"};
        Arrays.stream(seriesBucketList).forEach(System.out::println);
        System.out.println(Arrays.toString(Stream.of(seriesBucketList).toArray()));

        // Assigning to new array
        String[] showCharacters = new String[] {"Will", "Nancy", "Jaha", "Jhonnathan", "Octavia"};
        String[] showCharacters2 = Stream.of(showCharacters).toArray(String[]::new);
        System.out.println(Arrays.toString(showCharacters2));
    };


//    Generate random integers
    private static void generateRandomNumsInRange(int min, int max) {
        Random r = new Random();
        IntStream randomNums = r.ints(min, (max + 1)).limit(10);
        randomNums.forEach(elem -> System.out.println(elem));
    };

//    JAVA8 stream findFirst() vs findAny()
    private static void findElements() {
        // findAny() validates if any element does exists or not
        List<Integer> bluearray = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> findAnyVal = bluearray.stream().filter(ele -> ele == 2 &&  ele == 3 && ele == 9).findAny();
        System.out.println(findAnyVal.isPresent());

        // findFirst() fetches the first element in the stream
        List<String> strThings = Arrays.asList("Nancy", "Jonnathan", "will", "mike");
        Optional<String> stCharacter = strThings.stream().filter(character -> character.equals("willl") || character.equals("Nancy") || character.equalsIgnoreCase("mike")).findFirst();
        System.out.println(stCharacter.get());
    };


//    Arrays contains a certain value ?  // list.contains() // list.stream.anyMatch() //
    private static void validateArrElems() {
        System.out.println("-- Entering method validateArrElems --");
        String[] strelems = new String[] {"bike", "moto", "car", "jeep"};
        boolean isEleExists = Arrays.asList(strelems).contains("car");
        boolean isEleExists2 = Arrays.stream(strelems).anyMatch("cars"::equalsIgnoreCase);

        System.out.println(isEleExists);
        System.out.println(isEleExists2);

        //filtering primitive arrays
        int[] bluenums = {2,3,7,4,21,99,6};
        boolean isEleExists3 = IntStream.of(bluenums).anyMatch(x -> x == 3);
        System.out.println(isEleExists3);

        String[] strnameshere = {"mike", "will", "jonnathan", "hopper", "bob"};
        System.out.println(Arrays.asList(strnameshere));
        System.out.println(Stream.of(strnameshere).collect(Collectors.toList()));
        System.out.println(Arrays.asList(strnameshere).contains("will"));
        System.out.println(Stream.of(strnameshere).anyMatch("mike"::equalsIgnoreCase));
    };

}
