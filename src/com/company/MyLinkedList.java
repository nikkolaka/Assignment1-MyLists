package com.company;

import java.lang.reflect.Type;

public class MyLinkedList <Type>{

    Node first = null;
    Node current = null;
    Node previous = null;
    int size;


    private class Node {
        Type item;
        Node next;

        Node(Type data){
            this.item = data;
            this.next = first;
            size = size+1;
        }
        public String toString(){
            return item.toString();
        }

    }
    public void addBefore(Type item){
        Node newNode = new Node(item);
        if(current == null) {
            current = newNode;
            first = current;
        } else {
            previous = newNode;
            newNode.next = current;
        }
    }
    public void addAfter(Type item){
        if(current != null){
            Node newNode = new Node(item);
            newNode.next = current.next.next;
            current.next = newNode;
        }
    }
    public Type remove(){
        if(current != null){
            Type data = current.item;
            previous.next = current.next;
            current = previous.next;
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
        if(current == null){
            return null;
        } else {
            current = current.next;
            return current.item;
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
        String string = "["+current.toString();
        for(int i=0; i<size-2;i++){
            next();
            string = string+","+current.toString();
        }
        string = string+"]";
        return string;
    }

}
