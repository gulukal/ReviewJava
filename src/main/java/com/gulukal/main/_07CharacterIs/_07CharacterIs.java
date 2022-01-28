package com.gulukal.main._07CharacterIs;

public class _07CharacterIs {

    public static void main(String[] args) {

        String str="Gulten3";
        char ch = str.charAt(6);
        System.out.println(Character.isDigit(ch)); //sayi mi   true
        System.out.println(Character.isLetter(ch)); //harf mi   false
        System.out.println(Character.isWhitespace(ch)); //bosluk mu   false
    }
}
