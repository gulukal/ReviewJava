package com.gulukal.main._05Scanner;

import java.util.Scanner;

public class _05ScannerMethod {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir bilgi giriniz...");

        String str=input.nextLine();

        System.out.println("Girilen deger: "+ str);

    }
}
