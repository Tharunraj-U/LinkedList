package org.example;


import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        SinglyLInkedList ll=new SinglyLInkedList();
        ll.add(23);
        ll.add(24);


        ll.addMoreVal(23,323,324,3423,432,432,4,324,34,343,424,24);
        ll.insertAtFirst(0);
        ll.insertAtMiddle(123,1222);
        ll.display();
        ll.deleteAtFirst();
        System.out.println(ll.size);
        ll.deleteAtLast();

        ll.display();
        System.out.println(ll.size);
        ll.deleteAtIndex(324);
        ll.display();
        System.out.println(ll.size);
        }
}