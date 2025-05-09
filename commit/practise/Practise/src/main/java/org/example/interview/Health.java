package org.example.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Health {


    //[2,1,5]
    //k=11  (5+5+1)
    //Least number of combination






//    1. target can be present in array  .So need to check whether it is present
//    2. array cannot be empty  n>1
//    3.
////    [5,2,1] -> sort in descending order  O(nlogn)
//      5<11
////    11-5=6
//      5<6
////    6-5=1
//      5<1
////    1-1=0

    public  static  void main(String args[]){
        List<Integer> inputList =List.of(2,3);


        int target=1;
        int n = inputList.size();
        //array cannot be empty  n>1
        if(inputList.size() > 1 && inputList.isEmpty() ){
            System.out.println("Invalid Input");
        }

        int  iterationResult= 0;
        int iterationElement =0;

        List<Integer> combinationList =new ArrayList<>();


        //target can be present in array  .So need to check whether it is present
        if(inputList.contains(target)){
            System.out.println("least Combination is :"+target);
        }

       List<Integer> descList =  inputList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        ////    [5,2,1] -> sort in descending order  O(nlogn)
//      5<11
////    11-5=6
//      5<6
////    6-5=1
//      5<1
////    1-1=0
        iterationElement = descList.get(0);
        int i=0;
        while(i<n){
            if(iterationElement < target || iterationElement == target) {
                System.out.println(target + "  " +iterationElement);
                iterationResult = target - iterationElement;  // 1-1  = 0
                combinationList.add(iterationElement);  //1
                target = iterationResult;
                if( target == 0)
                    break;
            }else{     // false iterate to next element
                i++;
                iterationElement = descList.get(i);
            }
        }

        System.out.println("Least number of combination" +combinationList);
    }

//
//
//package org.example.interview;
//
//import java.util.*;
//
//    public class Health {
//
//        public static void main(String[] args) {
//            List<Integer> inputList = List.of(5, 2, 1); // Example input
//            int target = 11;
//
//            // Validate input
//            if (inputList == null || inputList.isEmpty()) {
//                System.out.println("Invalid Input: List is empty");
//                return;
//            }
//
//            if (target <= 0) {
//                System.out.println("Invalid Input: Target should be positive");
//                return;
//            }
//
//            // Check if target is directly present
//            if (inputList.contains(target)) {
//                System.out.println("Least combination is: [" + target + "]");
//                return;
//            }
//
//            // Step 1: Find the max element <= target in one pass (O(n))
//            int maxElement = -1;
//            for (int num : inputList) {
//                if (num <= target && num > maxElement) {
//                    maxElement = num;
//                }
//            }
//
//            // Step 2: If no usable element found
//            if (maxElement == -1) {
//                System.out.println("Target cannot be formed with given elements.");
//                return;
//            }
//
//            // Step 3: Use the largest available number greedily
//            List<Integer> combination = new ArrayList<>();
//            int remaining = target;
//
//            while (remaining >= maxElement) {
//                combination.add(maxElement);
//                remaining -= maxElement;
//            }
//
//            // Step 4: Try filling the rest using smaller numbers (one pass)
//            for (int num : inputList) {
//                while (remaining >= num) {
//                    combination.add(num);
//                    remaining -= num;
//                }
//            }
//
//            if (remaining == 0) {
//                System.out.println("Least number of combination: " + combination);
//            } else {
//                System.out.println("Target cannot be formed exactly with given elements.");
//            }
//        }
//    }
//
//
//
//


}
