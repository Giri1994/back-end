package org.example.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cap {

    public static void main (String args[]){

        List<Integer> list1= Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> list2=Arrays.asList(7,8);


        List<List<Integer>> resultList =new ArrayList<>();

        list1.stream().forEach( e-> {
            List<Integer> template =new ArrayList<>();
            template.add(e);
            template.addAll(list2);
            resultList.add(template);
        });



        System.out.println("Result"+resultList);

    }


}
