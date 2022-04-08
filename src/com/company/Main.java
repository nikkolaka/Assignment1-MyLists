package com.company;

public class Main <Type>{

    public static void main(String[] args) {
	MyLinkedList<Integer> list = new MyLinkedList<>();
    list.addBefore(1);
    list.addAfter(2);
    list.addAfter(3);
    list.addAfter(4);
    System.out.println(list.toString());

    }
}
