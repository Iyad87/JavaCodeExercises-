package com.iyad.myLinkedList;

import java.util.Scanner;

public class MyLinkedList {


    public static MyNode insert(MyNode head, int data) {
        //Complete this method
        MyNode newNode = new MyNode(data);
        if(head==null) return newNode;
        MyNode node = head;
        while (node.getNext()!= null){
               node = node.getNext();
        }
        node.setNext(newNode);
        return head;
    }

    public static void display(MyNode head) {
        MyNode start = head;
        while (start != null) {
            System.out.print(start.getData() + " ");
            start = start.getNext();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        MyNode head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}
