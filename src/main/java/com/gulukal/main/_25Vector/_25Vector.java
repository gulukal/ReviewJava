package com.gulukal.main._25Vector;

import java.util.Stack;
import java.util.Vector;

public class _25Vector {

    public static void main(String[] args) {

        vectorMethod();

    }

    public static void create(){

        Stack<Integer> stack = new Stack<>();
    }

    public static void vectorMethod(){

        Vector<Double> vect = new Vector<>();

        vect.add(1.0);
        vect.add(2.23);
        vect.add(5.23);
        vect.add(1, 1.0); // 1. elemani 1 double ini ekle

        for (Double aDouble : vect) {
            System.out.println(aDouble);

        }
    }


}
