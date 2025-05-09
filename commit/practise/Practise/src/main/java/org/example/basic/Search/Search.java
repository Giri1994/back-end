package org.example.basic.Search;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Search {

    public static void main(String args[]) {
        List<Integer> inputVal = List.of(2, 4, 5, 9, 6, 7, 19, 10, 11);
        int x = 11;
        int val = linearSearch(inputVal, x);
        System.out.println(val);
        List<Integer> inputValSort = inputVal.stream().sorted().collect(Collectors.toList());

        System.out.println(inputValSort);
        int result = binarySearch(inputValSort, x);
        System.out.println(result);

    }

    private static int binarySearch(List<Integer> inputValSort, int x) {
        int start = 0;
        int end = inputValSort.size()-1;
        int mid =0;
        while (start<=end){

             mid = (start +end)/2;

             System.out.println(mid);
             if(inputValSort.get(mid) == x){
                 return mid+1;
             }

             if(inputValSort.get(mid) > x){
                 end = mid-1;
             }else{
                 start =mid+1;
             }

        }

        return 0;
    }

    private static int linearSearch(List<Integer> inputVal, Integer x) {

        for (int i = 0; i < inputVal.size(); i++) {
            if (inputVal.get(i) == x)
                return i + 1;
        }
        return 0;
    }
}
