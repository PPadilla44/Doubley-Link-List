package com.doubleLinkedList;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class DLLTest {
    public static void main(String[] args) {
        DLL dll = new DLL();
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(50);
        Node n4 = new Node(60);
        Node n5 = new Node(80);
        Node n6 = new Node(100);

        dll.push(n1);
        dll.push(n2);
        dll.push(n3);
        dll.push(n4);
        dll.push(n5);
        dll.push(n6);

        dll.printValuesForward();


        System.out.println("\n-----Removing node from end-----\n");

        Node test = dll.pop();

        System.out.println("Return node:\t" + test.value);


        System.out.println("\n-----Printing new list of nodes-----\n");

        dll.printValuesForward();

        System.out.println("\nNew tail node:\t" + dll.tail.value);


        System.out.println("\n-----Testing Contain method-----\n");

        System.out.println("Input 50:\t" + dll.contains(50));
        System.out.println("Input -1:\t" + dll.contains(-1));

        System.out.println("\n-----Testing Size Method-----\n");

        System.out.println(dll.size());


        System.out.println("\n-----Testing insertAt Method-----\n");

        dll.insertAt(new Node(120),1);

        dll.insertAt(new Node(240),6);

        dll.insertAt(new Node(340),0);

        dll.printValuesForward();


        System.out.println("\n-----Testing removeAt method-----\n");

        dll.removeAt(0);

        dll.removeAt(dll.size());

        dll.removeAt(2);

        dll.printValuesForward();


        System.out.println("\n-----Testing isPalidrome method-----\n");

        dll.printValuesForward();
        System.out.println(dll.isPalindrome());

        DLL palindrome = new DLL();
        palindrome.push(new Node(3));
        palindrome.push(new Node(2));
        palindrome.push(new Node(1));
        palindrome.push(new Node(0));
        palindrome.push(new Node(1));
        palindrome.push(new Node(2));
        palindrome.push(new Node(3));

        System.out.println();

        palindrome.printValuesForward();
        System.out.println(palindrome.isPalindrome());


    }

}
