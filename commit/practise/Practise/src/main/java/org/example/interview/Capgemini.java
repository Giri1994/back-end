package org.example.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Capgemini {

    public static void main(String args[]){

        //paragraph contain number of words  to find the duplicate or occurance  words

       String inputVal= " paragraph contain number of words  to  to  of find the duplicate or occurance  words";

         String [] arrVal = inputVal.split(" ");

    Arrays.stream(arrVal).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).forEach((k,v)->{
        if (v > 1 && k != ""){
            System.out.println( k +"="+v);
        }
       });



    }
}
