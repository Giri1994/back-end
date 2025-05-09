package org.example.interview;

class Solution {



    //Adapter

    // transaction management service ->payment gateway rayzorpay(success ,failure(terminated) ,pending(inquery))

//        Given the head of a singly linked list, return true if it is a
//                palindrome
//
//        or false otherwise.


//
//
//                Example 1:
//        Input: head = [1,2,2,1]Output: true      1,2   2,1   => 1,2  1,4   1,2,1,2,1 <- head
//        Example 2:                                                          1->2->1->2->1
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

//        public boolean isPalindrome(ListNode head) {
//
//        }

//
//    Here's the complete Java solution to check if a singly linked list is a palindrome:
//
//    Approach:
//    Find the Middle: Use slow and fast pointers to find the middle of the linked list.
//    Reverse the Second Half: Reverse the second half of the list.
//    Compare Both Halves: Compare the first half with the reversed second half.
//            Restore (Optional): Reverse the second half back to its original form if needed.
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // Step 1: Find the middle of the linked list
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the linked list
        ListNode secondHalf = reverseList(slow);
        ListNode firstHalf = head;

        // Step 3: Compare both halves
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    // Helper method to reverse a linked list
    private ListNode reverseList(ListNode head) {
        ListNode prev = null, next = null;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev; // New head of the reversed list
    }
}
