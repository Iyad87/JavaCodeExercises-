package com.iyad.myLinkedList;

public class MyNode {

    private int data;
    private MyNode next;
    public MyNode(int d) {
        data = d;
        next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }
}
