package com.ds.linkedlist;

public class LinkedList {
    Node head;

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head==null){
            head = node;
        }else{
            Node n  = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
        }

    }

    public void insertAtHead(int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0) {
            insertAtHead(data);
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
    public void show(){
        Node node = head;
        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void deleteHead(){
        head = head.next;
    }

    public void deleteAtIndex(int i){

        if(i == 0){
            deleteHead();
        }else{
            Node n = head;
            Node n1 = null;
            for (int j=0 ; j<i-1; j++){
             n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
        }
    }
}
