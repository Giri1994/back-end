package org.example.interview;

import org.example.entity.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Cams {

    public  static void main(String args[]){

        List<Employee>  inputVal= new ArrayList<>();
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//        this.department = department;
//        this.yearOfJoining = yearOfJoining;
//        this.salary = salary;
        inputVal.add(new Employee(1,"Giri",26, "Male","IT",2016,1000));
        inputVal.add(new Employee(1,"Raj",26, "Male","IT",2016,1000));
        inputVal.add(new Employee(2,"Kanda",30, "Male","IT",2016,2000));
        inputVal.add(new Employee(3,"Tamil",31, "Male","IT",2016,3000));
        inputVal.add(new Employee(4,"Ravi",27, "Male","csc",2016,1000));
        inputVal.add(new Employee(5,"Latha",29, "Female","csc",2016,2000));
        inputVal.add(new Employee(6,"Sam",26, "Male","csc",2016,3000));
        inputVal.add(new Employee(1,"Ajay",26, "Male","csc",2016,1000));

        // each dept 3rd highest salary
      Map<String,List<Employee>> result =  inputVal.stream().sorted((e1, e2) -> (int) (e2.getSalary() - e1.getSalary())).skip(4).collect(Collectors.groupingBy(Employee::getDepartment));
        result.forEach((k,v)->{
            System.out.println(k +"="+v);
        });

        // Group by department and find the 3rd highest salary employee in each department
        Map<String, Optional<Employee>> thirdHighestSalaryPerDept = inputVal.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream()
                                        .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()) // Sort by salary desc
                                        .distinct() // Remove duplicates
                                        .skip(2) // Skip top 2 (to get the 3rd highest)
                                        .findFirst() // Pick the 3rd highest if exists
                        )
                ));

        // Print the results
        thirdHighestSalaryPerDept.forEach((dept, employee) ->
                System.out.println(dept + " = " + (employee.isPresent() ? employee.get() : "No 3rd highest salary"))
        );
    }



        //Adapter

        // transaction management service ->payment gateway rayzorpay(success ,failure(terminated) ,pending(inquery))

//        Given the head of a singly linked list, return true if it is a
//                palindrome
//
//        or false otherwise.
//
//
//                Example 1:
//        Input: head = [1,2,2,1]Output: true
//        Example 2:
//        Input: head = [1,2]Output: false
//
//        Constraints:
//        The number of nodes in the list is in the range [1, 105].
//        0 <= Node.val <= 9


        /**
         * Definition for singly-linked list.
         * public class ListNode {
         *     int val;
         *     ListNode next;
         *     ListNode() {}
         *     ListNode(int val) { this.val = val; }
         *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         * }
         */
//        class Solution {
//            public boolean isPalindrome(ListNode head) {
//
//            }
//        }
//
//    }
}
