package com.gulukal.main._14IfElse;

public class _14IfElse {

    //        Less than: a < b
    //        Less than or equal to: a <= b
    //        Greater than: a > b
    //        Greater than or equal to: a >= b
    //        Equal to a == b
    //        Not Equal to: a != b

    public static void main(String[] args) {
        ifElse1();
        ifElse2();

    }

    public static void ifElse1(){
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }

    //    variable = (condition) ? expressionTrue :  expressionFalse;
    public static void ifElse2(){
        int time = 20;
        String result = (time > 18) ? "Good day." : "Good evening.";
        System.out.println(result);

    }

}
