package com.gulukal.main._11StringBufferBuilder;

public class _11StringBufferBuilder {


    public static void main(String[] args) {

        stringBuffer();
        stringBuilder();
        stringConcat();

    }


   public static void stringBuffer(){
        //mutable
        //StringBuffer thread safe
       StringBuffer buffer = new StringBuffer();
       buffer.append("Deniz ").append("Yonkuc ").append(2);
       String text= buffer.toString();

       System.out.println(text);

   }

    public static void stringBuilder(){

        //mutable
        StringBuilder builder = new StringBuilder();
        builder.append("Deniz ").append("Yonkuc ").append(2);
        String text= builder.toString();

        System.out.println(text);

    }

    public static void stringConcat(){

        //concat immutable
        String name="Deniz";
        System.out.println(name.concat(" Yonkuc ").concat("2"));
    }
}
