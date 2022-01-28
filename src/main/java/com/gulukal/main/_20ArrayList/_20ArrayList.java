package com.gulukal.main._20ArrayList;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//    Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
//    Collections
public class _20ArrayList {


    public static void main(String[] args) {

        arrayList();

    }

    public static void create() {

        //Creating a List of type String using ArrayList
        List<String> listArrayString = new ArrayList<>();

        //Creating a List of type Integer using ArrayList
        List<Integer> listArray = new ArrayList<>();

        //Creating a List of type Book using ArrayList
        List<Book> listObject = new ArrayList<>();

        //Creating a List of type String using LinkedList
        List<String> listLinkedString = new LinkedList<>();


    }


    public static void arrayList() {

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo"); //.add eklemek
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        cars.set(0,"Wolkwagen");  // .set icerigi degistirmek
//        cars.remove(0); //.remove belirtilen elemani silmek
//        cars.clear(); //tum icerigi silmek


        System.out.println(cars);
        System.out.println(cars.size());  //arrayList boyutunu verir
    }

}


