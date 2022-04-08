package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.addFirst(82);
        list2.addFirst(123);
        list2.addFirst(1982391);
        list2.addFirst(3);
        list2.addFirst(113);
        list.insert(7, 10);
        System.out.println(list.toString());


    }
}

