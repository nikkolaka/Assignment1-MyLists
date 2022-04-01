package com.company;

public class Main <Type>{

    public static void main(String[] args) {
	MyLinkedList<Integer> list = new MyLinkedList<>();
    list.addBefore(1);
    list.addBefore(2);
    list.addBefore(3);
    list.addBefore(4);
    System.out.println(list.toString());

    }
}
