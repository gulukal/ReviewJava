package com.gulukal.main._03Cast;

public class _03Cast {


//    Widening Casting (automatically) - converting a smaller type to a larger type size
//    byte -> short -> char -> int -> long -> float -> double
//
//    Narrowing Casting (manually) - converting a larger type to a smaller size type
//    double -> float -> long -> int -> char -> short -> byte

    public static void main(String[] args) {

        intToDouble();
        doubleToInt();

        stringToIntLongDouble();
        intLongToString();

        stringToInteger();

        intStringToInteger();

        stringToInt();
    }

    public static void intToDouble() {
        //int --> double
        //automatic cast
        int myI = 5;
        double myD = myI;

        System.out.println(myD);
    }

    public static void doubleToInt() {
        //double --> int
        //manual cast
        double myD = 5.5d;
        int myI = (int) myD;

        System.out.println(myI);
    }

    public static void stringToIntLongDouble() {

        String str = "200";
        int i = Integer.parseInt(str);
        long l = Long.parseLong(str);
        double d = Double.parseDouble(str);


        System.out.println(i);
        System.out.println(l);
        System.out.println(d);
    }

    public static void stringToInteger() {
        String str = "200";
        Integer i = Integer.valueOf(str);

        System.out.println(i);
    }

    public static void intLongToString() {
        int i = 200;
        long l = 300;

        String str = String.valueOf(i);
        String str1 = Integer.toString(i);

        String strl = String.valueOf(l);


        System.out.println(str);
        System.out.println(str1);
        System.out.println(strl);

    }

    public static void intStringToInteger(){

        int num = 4;
        String str= "4";
        Integer strInteger =Integer.valueOf(str);
        Integer numInteger=num;

        System.out.println(numInteger);
        System.out.println(strInteger);

    }


    public static void stringToInt(){

        String str= "4";
        int num =Integer.parseInt(str);

    }


}
