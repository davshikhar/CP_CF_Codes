package com.cp;

import java.util.Scanner;

public class CreateList {
    public class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            System.out.println("Nodes of the circular linked list: ");
            do{
                System.out.print(" "+ current.data);
                current = current.next;
            }while(current != head);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CreateList cl = new CreateList();
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("enter 1 if you want to enter the elements or 0 if you do not want");
            int n=sc.nextInt();
            if(n==1){
                System.out.println("enter the value to enter in the linked list");
                int j=sc.nextInt();
                cl.add(j);
            }
            else if (n==0)
                break;
        }
        cl.display();
    }

}
