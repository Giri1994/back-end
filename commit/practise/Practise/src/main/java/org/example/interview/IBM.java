package org.example.interview;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class IBM {

    public static void main(String args[]) {


        String inputVal1 = "abc";

        String inputVal2 = "bca";

        if (inputVal1.length() != inputVal2.length()) {
            System.out.println("Not a anagram");
        }

        HashMap<Character, Integer> map1 = new HashMap<>();

        HashMap<Character, Integer> map2 = new HashMap<>();

        // to find the length of String  and compare it will be anagram
        List<Character> charList1 = inputVal1.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        List<Character> charList2 = inputVal2.chars().mapToObj(e -> (char) e).collect(Collectors.toList());


        charList1.forEach(e -> {
            if (map1.containsKey(e)) {

                map1.put(e, map1.get(e) + 1);
            } else {

                map1.put(e, 1);
            }
        });


        charList2.forEach(e -> {
            if (map2.containsKey(e)) {

                map2.put(e, map2.get(e) + 1);
            } else {

                map2.put(e, 1);
            }
        });

//        a=1,b=1,c=1
//        a=2,b=2,c=2


// Compare frequency maps
        if (map1.equals(map2))
            System.out.println("They are anagram");


    }


}
