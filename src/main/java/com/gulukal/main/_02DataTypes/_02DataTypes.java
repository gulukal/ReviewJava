package com.gulukal.main._02DataTypes;

public class _02DataTypes {

    // String - stores text, such as "Hello". String values are surrounded by double quotes
    // int - stores integers (whole numbers), without decimals, such as 123 or -123
    // float - stores floating point numbers, with decimals, such as 19.99 or -19.99
    // char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
    // boolean - stores values with two states: true or false

    // arimatik operatorler + - */ ++ -- %
    // iliskisel operatorler > < = == >= <=
    // mantiksal operatorler & (anpersan) && (ve) || (pipe) (veya) != (degil)
    // atama operatorleri += -= *= /=


    public static void main(String[] args) {

        //primitive data types
        int myNum = 5;
        float myFloatNum = 5.99f; //f veya F
        char myLetter = 'D';
        boolean myBool = true;
        double mydouble = 5.66d; //d veya D
        long myLong = 5l; //l veya L

        //String bir class dir.
        String myText = "Hello";

        //wrapper class
        Integer wrNum = new Integer(5);  // aslinda olan durum bu ama belirtmek gerekli degildir
        Float wrFloatNum = 5.99f; //f veya F
        Character wrLetter = 'D';
        Boolean wrBool = true;
        Double wrDouble = 5.66d; //d veya D
        Long wrLong = 5l;  //l veya L

        System.out.println("int " + myNum + " Integer " + wrNum);
        System.out.println("float " + myFloatNum + " Float " + wrFloatNum);
        System.out.println("char " + myLetter + " Character " + wrLetter);
        System.out.println("boolean " + myBool + " Boolean " + wrBool);
        System.out.println("double " + mydouble + " Double" + wrDouble);
        System.out.println("String " + myText);
        System.out.println("long " + wrLong + " Long " + wrLong);

    }

}