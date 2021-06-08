package com.doubleLinkedList;

public class DLL {
    public Node head;
    public Node tail;

    public DLL() {
        this.head = null;
        this.tail = null;
    }

    // the push method will add a new node to the end of the list
    public void push(Node newNode) {
        // if there is no head in the list, aka, an empty list, we set the newNode to be the head and tail of the list
        if(this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }

        // first find the lastNode in the list
        // then, set the lastNode's next to be the newNode;
        // then, we have to set the previous of the lastNode to the lastNode that we found previously.
        // finally, set the list's tail to be the node that we have added
        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        this.tail = newNode;
    }

    public void printValuesForward() {
        // find the first node, aka head.
        Node current = this.head;

        // while the current node exists...
        while(current != null) {
            // print it's value
            System.out.println(current.value);
            // and move on to it's next node.
            current = current.next;
        }
    }

    public void printValuesBackwards(){

        Node current = this.tail;

        while(current != null) {
            System.out.println(current.value);
            current = current.previous;
        }

    }


    public Node pop(){

        this.tail.previous.next = null;
        Node returnNode = this.tail;
        this.tail = tail.previous;

        return returnNode;
    }


    public boolean contains(Integer value) {

        Node current = this.head;

        while(current != null) {

            if(current.value.equals(value)) {
                return true;
            }

            current = current.next;
        }
        return false;
    }

    public int size() {

        int count = 0;
        Node current = this.head;

        while(current != null) {
            count++;
            current = current.next;
        }
        return count;
    }


    public void insertAt(Node newNode, int index) {

        if (index > size()) {
            System.out.println("Index: " + index + " is out of range");
        } else if (index == size()) {

            this.tail.next = newNode;
            newNode.previous = this.tail;
            this.tail = newNode;


        } else if(index == 0) {

            this.head.previous = newNode;
            newNode.next = this.head;
            this.head = newNode;

        } else {

            Node current = head;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            newNode.next = current.next;
            newNode.previous = current;
            current.next = newNode;
            newNode.next.previous = newNode;
        }
    }


    public void removeAt(int index) {

        if (index > size()) {
            System.out.println("Index: " + index + " is out of range");
        } else if (index == size()) {
            this.tail.previous.next = null;
            this.tail = this.tail.previous;

        } else if(index == 0) {

            this.head.next.previous = null;
            this.head = this.head.next;

        } else {

            Node current = head;

            for (int i = 0; i < index-1; i++) {
                current = current.next;
            }

            current.next = current.next.next;
            current.next.next.previous = current;

        }
    }

    public boolean isPalindrome() {
        Node start = this.head;
        Node end = this.tail;
        while(start != end) {
            if(!start.value.equals(end.value)) {
                return false;
            }

            start = start.next;
            end = end.previous;
        }

        return true;
    }
}
