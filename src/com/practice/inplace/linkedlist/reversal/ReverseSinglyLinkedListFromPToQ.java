package com.practice.inplace.linkedlist.reversal;

public class ReverseSinglyLinkedListFromPToQ {

    public static SinglyListNode reverse(SinglyListNode listNode, int p, int q){
        SinglyListNode head = listNode;
        SinglyListNode prev = null;
        SinglyListNode pNode = null;
        SinglyListNode nodeBeforePNode = null;

        while (listNode.value != p){
            nodeBeforePNode = listNode;
            listNode = listNode.next;
        }
        pNode = listNode;

        while (listNode.value != q){
            listNode = listNode.next;
        }
        if(nodeBeforePNode != null)
        {
            nodeBeforePNode.next = listNode;
        }
        SinglyListNode nodeAfterQNode = listNode.next;
        prev = nodeAfterQNode;
        while (pNode != nodeAfterQNode){
            SinglyListNode next = pNode.next;
            pNode.next = prev;
            prev = pNode;
            pNode = next;
        }

        return (nodeBeforePNode == null)? prev:head;
    }
}
