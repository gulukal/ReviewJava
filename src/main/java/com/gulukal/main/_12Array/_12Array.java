package com.gulukal.main._12Array;

public class _12Array {

    public static void main(String[] args) {

        array1();
        array2();

    }

    public static void array1(){

        int[] range = new int[5];   //5 elemanli ve int barindiran range adinda bir array

        range[0]=11;
        range[1]=12;
        range[2]=13;
        range[3]=14;
        range[4]=15;

        for (int i = 0; i < range.length; i++) {

            System.out.println((i+1)+ ". eleman: "+ range[i]);
        }
    }

    public static void array2(){

        String[] day={"sunday","monday","thuesday","wednesday","thursday","friday","saturday"};

        for (int i = 0; i < day.length; i++) {

            System.out.println((i+1)+ ". gun: "+ day[i]);
        }
    }
}
