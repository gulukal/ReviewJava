package com.gulukal.main._09FactorialCalculater;


import lombok.extern.java.Log;

import java.util.InputMismatchException;
import java.util.Scanner;

@Log
public class _09FactorialCalculater {

    public static void main(String[] args) {

        calculate(inputInt());


    }

    public static int inputInt() {
        int i = 0;
        boolean bool = true;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Lutfen pozitif bir rakam giriniz: ");
                i = input.nextInt();
                bool = true;

            } catch (InputMismatchException e) {
                log.info(e.getMessage());
                bool = false;
            }
            if (i == 0 || i < 0) {
                log.info("Girilen deger kullanilamaz.");
                bool = false;

            }
        } while (!bool);

        return i;
    }

    public static void calculate(int i) {

        int retVal = 1;
        for (int j = 1; j <= i; j++) {
            retVal = retVal * j;
        }

        System.out.println(retVal);
    }
}
