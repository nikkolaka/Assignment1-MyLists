package com.company;

public class Main{

    public static void main(String[] args) {
	MyArrayList<Integer> list = new MyArrayList<>();
    for(int i = 0; i<40;i++){
        list.insert(i+1,i);
    }
    list.remove(7);
    list.insert(100,7);
    System.out.println(list.toString());


    }
}
