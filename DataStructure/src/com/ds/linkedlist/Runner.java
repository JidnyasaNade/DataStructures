package com.ds.linkedlist;

public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        //list.insertAtHead(50);

        list.insertAt(2,50);
        list.insertAt(0,60);

        list.deleteHead();
        list.deleteAtIndex(2);


        list.show();
    }
}
