package com.gulukal.main._08SplitStringTokenizer;

import java.util.StringTokenizer;

public class _08SplitStringTokenizer {

    public static void main(String[] args) {

        // Stringe.split ile string i parcalamak,

        String sentence = "Java ogrenmek, bir harika.";

        String[] dizi = sentence.split(",");
        for (int i = 0; i < dizi.length; i++) {

            System.out.println(dizi[i]);
        }

        for (String temp : dizi) {
            System.out.println(temp);
        }

        // StringTokenizer ile string i parçalamak;

        StringTokenizer tokenizer = new StringTokenizer(sentence, "& ~ "); // gırılen kelımelerı cumleden bagımsız
        // olarka alt alta sıralayabılıyoruz.
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());

        }

    }
}
