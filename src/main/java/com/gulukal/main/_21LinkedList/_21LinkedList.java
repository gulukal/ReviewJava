package com.gulukal.main._21LinkedList;


import java.util.LinkedList;
import java.util.List;

//    Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
//    Collections
public class _21LinkedList {


    public static void main(String[] args) {

        linkedList();

    }

    public static void create() {


        //Creating a List of type String using LinkedList
        List<String> listLinkedString = new LinkedList<>();


    }
    public static void linkedList(){

        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        cars.set(0,"Wolkswagen");
//        cars.remover(0);
        System.out.println(cars);

    }
}
