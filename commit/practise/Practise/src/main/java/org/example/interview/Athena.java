//package org.example.interview;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Athena {
//    public static void main(String[] args) {
//        List<Integer> inputVal = List.of(2, 5, 1, 9, 8, 4, 20, 11, 22, 33, 19);
//        //All subsets: [[2, 5], [1, 9], [8], [4, 20], [11, 22, 33], [19]]
//        //Longest subset: [11, 22, 33] This will correctly extract all increasing subsets and determine the longest one. 🚀 Let me know if you need modifications!
//        List<List<Integer>> result = new ArrayList<>();
//        List<Integer> longestSubset = new ArrayList<>();
//        List<Integer> currentSubset = new ArrayList<>();
//
//        for (int i = 0; i < inputVal.size(); i++) {
//            if (currentSubset.isEmpty() || inputVal.get(i) > currentSubset.get(currentSubset.size() - 1)) {
//                currentSubset.add(inputVal.get(i));
//            } else {
//                result.add(new ArrayList<>(currentSubset));
//                if (currentSubset.size() > longestSubset.size()) {
//                    longestSubset = new ArrayList<>(currentSubset);
//                }
//                currentSubset.clear();
//                currentSubset.add(inputVal.get(i));
//            }
//        }
//
//        if (!currentSubset.isEmpty()) {
//            result.add(new ArrayList<>(currentSubset));
//            if (currentSubset.size() > longestSubset.size()) {
//                longestSubset = new ArrayList<>(currentSubset);
//            }
//        }
//
//        System.out.println("All subsets: " + result);
//        System.out.println("Longest subset: " + longestSubset);
//    }
//}
