package com.company;

import java.lang.reflect.Type;

public class MyLinkedList <Type>{

    private Node first = null;
    private Node current = null;
    private Node previous = null;
    private int size;

    private class Node {
        Type item;
        Node next;

        Node(Type data){
            this.item = data;
            this.next = null;
        }
        public String toString(){
            return item.toString();
        }

    }
    public void addBefore(Type item){
        Node newNode = new Node(item);
        if(current == null) {
            if(previous == null){
                previous = newNode;
                first = previous;
            } else {
                previous.next = newNode;
                newNode.next = current;

                previous = newNode;
            }
            size += 1;

        } else {
            if(current == first){
                newNode.next = current;
                previous = newNode;
                first = previous;
                size += 1;
            } else{
                newNode.next = current;
                previous.next = newNode;
                previous = newNode;
                size+= 1;
            }
        }
    }
    public void addAfter(Type item){
        if(current != null){
            Node newNode = new Node(item);
            if(current.next == null){
                current.next = newNode;
                size += 1;
            } else{
                newNode.next = current.next;
                current.next = newNode;
                size += 1;
            }

        }
    }
    public Type remove(){
        if(current != null){
            Type data = current.item;
            if(current == first){
                first = first.next;
            } else if(current.next == null){
                previous.next = null;
            } else{
                previous.next = current.next;
                current = previous.next;
            }

            size --;
            return data;
        }
        return null;
    }
    public Type current(){
        if(current == null){
            return null;
        } else{
            return current.item;
        }
    }
    public Type first(){
        if(first == null){
            return null;
        } else{
            current = first;
            return current.item;
        }
    }
    public Type next(){
        if(current.next != null){
            previous = current;
            current = current.next;
            return current.item;
        } else {
            return null;
        }
    }

    public boolean contains(Type item){
        return current.item == item;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public String toString(){
        Node tempNode = first;
        if(tempNode == null){
            return "[]";
        }
        String string = "["+tempNode.toString();

        for(int i=0; i<size-1;i++){
            if(tempNode.next != null){
                tempNode = tempNode.next;
                string = string+","+tempNode.toString();
            }
        }

        string = string+"]";
        return string;
    }
}
