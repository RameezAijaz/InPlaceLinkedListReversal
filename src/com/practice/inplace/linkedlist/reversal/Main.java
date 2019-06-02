package com.practice.inplace.linkedlist.reversal;

public class Main {

    public static void main(String[] args) {
	// write your code here
/*
        Given the head of a Singly LinkedList, reverse the LinkedList. Write a function
        to return the new head of the reversed LinkedList.
        */

        SinglyListNode listNode = new SinglyListNode(2);
        listNode.next = new SinglyListNode(4);
        listNode.next.next = new SinglyListNode(6);
        listNode.next.next.next = new SinglyListNode(8);
        listNode.next.next.next.next = new SinglyListNode(10);


        SinglyListNode reverseHead = ReverseSinglyLinkedListInplace.reverse(listNode);
        System.out.println("REVERSE SINGLY LINKED LIST 2->4->->6->8->10");
        while (reverseHead != null){
            System.out.println(reverseHead.value);
            reverseHead = reverseHead.next;
        }

/*
        Given the head of a LinkedList and two positions ‘p’ and ‘q’,
        reverse the LinkedList from position ‘p’ to ‘q’.

        */
        listNode = new SinglyListNode(1);
        listNode.next = new SinglyListNode(2);
        listNode.next.next = new SinglyListNode(3);
        listNode.next.next.next = new SinglyListNode(4);
        listNode.next.next.next.next = new SinglyListNode(5);

        int p=1,q=4;

        listNode = ReverseSinglyLinkedListFromPToQ.reverse(listNode, p, q);
        System.out.println("REVERSE SINGLY LINKED LIST 1->2->3->4->5 from 1 to 4");
        while (listNode != null){
            System.out.println(listNode.value);
            listNode = listNode.next;
        }

/*
        Given the head of a LinkedList and a number ‘k’, reverse every ‘k’ sized sub-list starting from the head.

        If, in the end, you are left with a sub-list with less than ‘k’ elements, reverse it too.
        */


        listNode = new SinglyListNode(1);
        listNode.next = new SinglyListNode(2);
        listNode.next.next = new SinglyListNode(3);
        listNode.next.next.next = new SinglyListNode(4);
        listNode.next.next.next.next = new SinglyListNode(5);
        listNode.next.next.next.next.next = new SinglyListNode(6);
        listNode.next.next.next.next.next.next = new SinglyListNode(7);
        listNode.next.next.next.next.next.next.next = new SinglyListNode(8);

        listNode = ReverseEveryKSizedSubList.reverse(listNode, 3);

        System.out.println("REVERSING EVERY K SIZE SINGLY LINKED LIST IN 1->2->3->4->5->6->7->8");
        while (listNode != null){
            System.out.println(listNode.value);
            listNode = listNode.next;
        }


    }
}
