package com.company;

public class MyArrayList <Type>{
    private int capacity = 16;
    private Type[] list = (Type[]) new Object[capacity];

    private int size = 0;



    public void insert(Type item, int index){
        if(index<=size && index>=0){
            size++;
            if(size>capacity){
                resize();
            }
            for(int i = size-1; i>index; i--){
                list[i] = list[i-1];
            }
            list[index] = item;
        }

    }
    public Type remove(int index){
        if(index<size && index>=0){
            Type data = list[index];
            list[index] = null;
            for(int i = index ; i<size; i++){
                if(list[i+1] == null){
                    list[i] = null;
                } else{
                    list[i] = list[i+1];
                }

            }
            size--;
            return data;
        }
        else{
            return null;
        }
    }
    public boolean contains(Type item){
        for(int i = 0; i<size;i++){
            if(list[i] == item){
                return true;
            }
        }
        return false;
    }
    public int indexOf(Type item){
        for(int i = 0; i<size;i++){
            if(list[i] == item){
                return i;
            }
        }
        return -1;
    }
    public Type get(int index){
        if(index<size && index>=0){
            return list[index];
        }
        return null;
    }
    public void set(int index, Type item){
        if(index<size && index>=0) {
            list[index] = item;
        }
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public String toString(){
        if(size == 0){
            return "[]";
        }
        StringBuilder string = new StringBuilder("[" + list[0]);
        for (int i = 1; i<size;i++){
            string.append(",").append(list[i]);
        }
        string.append("]");
        return string.toString();
    }
    private void resize(){
        capacity = capacity*2;
        Type[] temp = (Type[]) new Object[capacity];

        for(int i=0; i<size-1;i++){
            temp[i] = list[i];
        }
        list = temp;
    }
}
