package org.example.interview;

import javax.swing.text.html.parser.Parser;
import java.util.ArrayList;
import java.util.List;

public class Forey {

    // Input val : 200000000000000 + 1000000000000

    //Eg. "1000" + "2000"


    public static void main(String args[]) {

        String a = "199";
        String b = "188";
        String result = " "; //    000
        String output = SumOfTwo(a, b);

        System.out.println("Result Value :" + output);

    }

    private static String SumOfTwo(String a, String b) {

        String temp;

        List<String> firstStringList = new ArrayList<>();
        List<String> secondStringList = new ArrayList<>();
        List<String> resultList = new ArrayList<>();
        StringBuilder resultVal = new StringBuilder();
        for (int i = a.length() - 1; i >= 0; i--) {
            firstStringList.add(String.valueOf(a.charAt(i)));

        }

        for (int i = b.length() - 1; i >= 0; i--) {

            secondStringList.add(String.valueOf(b.charAt(i)));
        }
        System.out.println(firstStringList);
        System.out.println(secondStringList);

        if (firstStringList.size() == secondStringList.size()) {
            int size = firstStringList.size();
            int carry = 0;

            for (int i = 0; i < size; i++) {
                int first = Integer.valueOf(firstStringList.get(i));
                int second = Integer.valueOf(secondStringList.get(i));

                int result = first + second + carry;
                carry = result / 10;
                int res = result % 10;

                resultVal.append(String.valueOf(res));
            }

            if (carry > 0) {
                resultVal.append(String.valueOf(carry));
            }
        }

        return resultVal.reverse().toString();
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

//    public class PairwiseSwap {
//        public static void main(String[] args) {
//            // Creating the linked list: 1 -> 2 -> 3 -> 4
//            Node head = new Node(1);
//            head.next = new Node(2);
//            head.next.next = new Node(3);
//            head.next.next.next = new Node(4);
//
//            System.out.println("Original List:");
//            printList(head);
//
//            head = swapPairs(head);
//
//            System.out.println("List After Pairwise Swap:");
//            printList(head);
//        }

//        // Function to swap nodes in pairs
//        public static Node swapPairs(Node head) {
//            // Base case: If the list is empty or has only one node, no swap is needed
//            if (head == null || head.next == null) {
//                return head;
//            }
//
//            // Nodes to be swapped
//            Node first = head;
//            Node second = head.next;
//
//            // Swapping
//            first.next = swapPairs(second.next); // Recursively swap the rest of the list
//            second.next = first; // Adjust the next pointer of the second node
//
//            // Return the new head node
//            return second;
//        }
//
//        // Utility function to print the linked list
//        public static void printList(Node head) {
//            Node current = head;
//            while (current != null) {
//                System.out.print(current.data + " -> ");
//                current = current.next;
//            }
//            System.out.println("null");
//        }
//    }
//

}
