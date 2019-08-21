package com.example.demo;
import java.util.*;

public class List03 {

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {

            this.val = val;
        }

    }


    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        Stack<Integer> sti=new Stack<>();
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        int count=0;
        while(listNode!=null){
            ++count;
//            sti.push(listNode.val);
            b.add(listNode.val);
//            System.out.println(listNode.val);
            listNode=listNode.next;
        }
        for(int i=1;i<=count;i++){
            a.add(b.get(count-i));
        }
//        System.out.println(a);

        return a;
    }

    public static void main(String[] args) {
        ListNode listNode1=new ListNode(1);
        ListNode listNode2=new ListNode(2);
        listNode1.next=listNode2;
        ListNode listNode3=new ListNode(3);
        listNode2.next=listNode3;
        printListFromTailToHead(listNode1);

    }
}
