package org.example.interview;

import java.util.*;

public class Health1 {

    public static void main(String[] args) {
        List<Integer> inputList = List.of(2,3); // Example input
        int target = 11;

        // Validate input
        if (inputList == null || inputList.isEmpty()) {
            System.out.println("Invalid Input: List is empty");
            return;
        }

        if (target <= 0) {
            System.out.println("Invalid Input: Target should be positive");
            return;
        }

        // If target is directly in the list
        if (inputList.contains(target)) {
            System.out.println("Least combination is: [" + target + "]");
            return;
        }

        // Sort the list in descending order (Greedy approach)
        List<Integer> descList = new ArrayList<>(inputList);
        descList.sort(Comparator.reverseOrder());

        List<Integer> combinationList = new ArrayList<>();
        int remainingTarget = target;

        for (int i = 0; i < descList.size(); i++) {
            int num = descList.get(i);
            while (remainingTarget >= num) {
                remainingTarget -= num;
                combinationList.add(num);
            }
        }

        if (remainingTarget != 0) {
            System.out.println("Target cannot be formed with given elements.");
        } else {
            System.out.println("Least number of combination: " + combinationList);
        }
    }
}
