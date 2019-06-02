package com.practice.inplace.linkedlist.reversal;

public class ReverseSinglyLinkedListInplace {

    public static SinglyListNode reverse(SinglyListNode head){

        SinglyListNode prev = null;

        while (head != null){
            SinglyListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
