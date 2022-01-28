package com.gulukal.main._10ReverseString;

import java.util.Scanner;

public class _10ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Birseyler girin:");
        String metin = input.nextLine();

        String cevrilen = cevir(metin);
        System.out.println("Cevrilen Yazi: " + cevrilen);
    }

    public static String cevir(String metin) {
        if (metin.isEmpty())
            return metin;
        return cevir(metin.substring(1)) + metin.charAt(0);
    }
}
