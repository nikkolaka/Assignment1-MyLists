package com.company;

import java.lang.reflect.Type;

public class MyLinkedList {

    Node first;
    Node current;
    Node previous;
    int size;


    private class Node {
        Type item;
        Node next;

        Node(Type data){
            item = data;
            next = null;
            size = size+1;
        }
        public String toString(){
            return item.toString();
        }

    }
    public static void addBefore(Type item){

    }
    public static void addAfter(Type item){

    }
    public static Type current(){

    }
    public static Type first(){

    }
    public static Type next(){

    }
    public static Type remove(){

    }
    public static boolean contains(Type item){

    }
    public static int size(){

    }
    public static boolean isEmpty(){

    }
    public String toString(){
        String string = "["+current.toString();
        for(int i=0; i<size-1;i++){
            next();
            string = string+","+current.toString();
        }
        string = string+"]";
        return string;
    }



}
}
