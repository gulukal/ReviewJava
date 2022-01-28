package com.gulukal.main._18ForLoop;

public class _18ForLoop {

    public static void main(String[] args) {

        forLoop();
        forEach();

    }

    public static void forLoop(){

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);

        }

    }

    public static void forEach(){

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
