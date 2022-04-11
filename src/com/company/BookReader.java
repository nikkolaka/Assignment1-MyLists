package com.company;
import java.io.*;

public class BookReader {
    String book;
    MyLinkedList<String> words = new MyLinkedList<>();


    public BookReader(String filename) throws IOException {
        readBook(filename);

        parseWords();
    }
    public void readBook(String filename) throws IOException {
        long duration = 0;
        long start = System.currentTimeMillis();
        File f = new File(filename);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        StringBuilder str = new StringBuilder();
        int c = 0;
        while((c = br.read()) != -1){
            char character = (char) c;
            str.append(character);

        }
        book = str.toString();
        long now = System.currentTimeMillis();
        duration = now - start;
        System.out.println("Reading input file '"+filename+" .... It has "+book.length()+" characters in "+duration+" milliseconds");
    }
    public void parseWords(){
        long duration = 0;
        long start = System.currentTimeMillis();
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < book.length(); i++){

                Character ch = book.charAt(i);
                if((ch.compareTo('A') >= 0 && ch.compareTo('Z') <= 0) || (ch.compareTo('a') >= 0 && ch.compareTo('z') <= 0) || (ch.compareTo('0') >= 0 && ch.compareTo('9') <= 0) || ch.equals('\'') ) {
                    str.append(ch);


                } else if(str.length() != 0){
                    words.addBefore(str.toString());
                    str.setLength(0);
                }
                if(i == book.length()){
                    System.out.println(str.toString());
                    words.addBefore(str.toString());
                }



        }

        long now = System.currentTimeMillis();
        duration = now - start;
        System.out.println("And "+words.size()+ " words in "+duration+" milliseconds");



    }
}
