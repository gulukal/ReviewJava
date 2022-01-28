package com.gulukal.main._16While;

import java.util.Scanner;

public class _16While {
    public static void main(String[] args) {

        whileMethod();
        whileMethod1();
        doWhileMethod();

    }

    public static void whileMethod(){

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

    }

    private static void whileMethod1() {

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Islemi tekrarlamak icin 1 e basiniz...");
            String str = input.nextLine();

            if (str.equals("1")) {

            } else {
                System.exit(0);

            }
        }
    }


    public static void doWhileMethod(){

        //kosul saglanmadiginda bile 1 defa loop donuyor
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);

    }


}
