package com.gulukal.main._04Math;

import java.util.Random;

public class _04Math {

    public static void main(String[] args) {

        System.out.println("min " + Math.min(24.6,10));
        System.out.println("max " + Math.max(24.6,10));
        System.out.println("rint (yakina yuvarla, double ve bucukta asagi)" + Math.rint(24.5));
        System.out.println("round (yakina yuvarla, int ve bucukta yukari)" + Math.round(24.5));
        System.out.println("abs (mutlak deger) " + Math.abs(-10));
        System.out.println("ceil (yukari yuvarla)" + Math.ceil(24.6));
        System.out.println("floor (asagi yuvarla) " + Math.floor(24.6));
        System.out.println("sqrt (kok) " +Math.sqrt(64));
        System.out.println("cbrt (kupkok) " + Math.cbrt(8));
        System.out.println("pow (ussu) " + Math.pow(2,3));
        System.out.println("random (0-1) " + Math.random());
        System.out.println("random (0-100) " + (int)(Math.random()*101));
        System.out.println("random (1-5) "+ Math.floor(Math.random() * 5 + 1));
        System.out.println("hypot (hipotenus) " + Math.hypot(3,4));
        System.out.println("bolumden kalan " + (10%3));
        System.out.println("signum " +"\n"+" 10 " + Math.signum(-10) +"\n"+" -10 "+ Math.signum(10) +"\n"+" 13,4 "+ Math.signum(13.4) +"\n"+" 0.00/0 "+Math.signum(0.0/0)+"\n"+" 0 "+Math.signum(0));

        random();

    }

    //random class i
    public static void random(){

        Random randomClass = new Random();

        int randomNumber = randomClass.nextInt(9) + 1; // 9 ust sınır 1 alt sınır cıkacak rastgele sayı 1 ıle 9
        // arasındadır.
        System.out.println("random class number  (1-9) " + randomNumber);
    }


}
