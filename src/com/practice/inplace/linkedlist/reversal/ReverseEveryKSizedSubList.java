package com.practice.inplace.linkedlist.reversal;

public class ReverseEveryKSizedSubList {
    public static SinglyListNode reverse(SinglyListNode listNode, int k){

        int i=0;
        SinglyListNode head = null;
        SinglyListNode subListHead = null;
        SinglyListNode subListTail = null;
        SinglyListNode prev = null;

        while (true){
            SinglyListNode tmp = listNode;
            while (i<k && listNode != null){
                SinglyListNode next = listNode.next;
                listNode.next = prev;
                prev = listNode;
                listNode = next;
                i++;
            }
            if(subListTail != null){
                subListTail.next = prev;
            }
            subListHead = prev;
            if(subListTail == null)
            {
                head = subListHead;
            }
            subListTail = tmp;

            prev = null;

            if(i==0)
                break;
            i=0;
        }

        return head;
    }
}
