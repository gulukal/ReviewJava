package com.gulukal.main._23HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class _23HashSet {

    public static void main(String[] args) {

        hashSet();
    }

    public static void create() {

        HashSet<String> cars = new HashSet<String>();
    }

    public static void hashSet() {

        HashSet<String> cars = new HashSet<String>();

        cars.add("Volvo");
        cars.add("BMW"); //tekrar eden verileri almaz bir tane alir
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");

        System.out.println(cars);
        System.out.println(cars.contains("Mazda")); //contains method
        System.out.println(cars.size());

        System.out.println(1);
        for (String i : cars) {
            System.out.println(i);
        }

        System.out.println(2);
        cars.forEach(System.out::println);


        System.out.println(3);
        Iterator<String> itr = cars.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}

