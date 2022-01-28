package com.gulukal.main._15Ternary;

import java.util.Scanner;

public class _15Ternary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String word = input.nextLine();

        //Ternary
        String ends = (word.endsWith("a")) ? "evet a ile bitiyor" : "hayir a ile bitmiyor";
        System.out.println(ends);

        input.close();

    }
}
