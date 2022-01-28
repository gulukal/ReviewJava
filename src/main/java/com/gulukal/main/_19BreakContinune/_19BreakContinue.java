package com.gulukal.main._19BreakContinune;

public class _19BreakContinue {

    public static void main(String[] args) {

        breakForLoop();
        System.out.print(000);
        continuePassLoop();
        System.out.print(000);
        breakWhile();
        System.out.print(000);
        continueWhile();

    }


    public static void breakForLoop() {

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
    }


    public static void breakWhile() {

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }

    }

    public static void continuePassLoop() {

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

    }

    private static void continueWhile() {

        int i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;

        }
    }
}
