package com.gulukal.main._06String;

import java.util.Locale;

public class _06StringMethod {

    public static void main(String[] args) {

        String str = "String method denemeleri.";
        String str1 = " ";
        System.out.println(str.startsWith("S")); //true
        System.out.println(str.endsWith(".")); //true
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(1)); //0-1-2...
        System.out.println(str.length()); //bosluklar dahil tum karakterlerin adeti
        System.out.println(str.equalsIgnoreCase("String METHOD denemeleri.")); //true
        System.out.println(str.equals("String method denemeleri.")); //true
        System.out.println(11);
        System.out.println(str1.isEmpty()); //false (" ")
        System.out.println(str1.isBlank()); //true (" ")
        System.out.println(str.replaceAll("e","q")); //tum e ler q ya doner
        System.out.println(str.replaceFirst("q","e")); //tum q ler e ya doner
        System.out.println(str.replace("e","q")); //tum e ler q ya doner
        System.out.println(str.replace("String","Replace"));


        System.out.println("format:");
        stringFormat();
        System.out.println("substring:");
        substringMethod();
        System.out.println("contains:");
        containsMethod();
        System.out.println("join:");
        joinMethod();
        System.out.println("concat:");
        concatMethod();
        System.out.println("split:");
        splitMethod();
        System.out.println("indexOf:");
        indexOfMethod();
        System.out.println("valueOf:");
        valueOfMethod();
        System.out.println("trim:");
        trimMethod();
        System.out.println("lowerCase:");
        lowerCaseMethod();


    }

//    public static void cloneMethod(){
//        String str1 = "hello";
//        String str2 = str1; //reference to the same string
//        str1 = "bye"; //new string created
//
//        String str3 = "hello";
//        String str4 = (String)str3.clone();//reference to the same string
//        str3 = "bye";//new string created
//    }

    public static void stringFormat() {
        String str1 = String.format("%d", 101);      // 101
        String str2 = String.format("|%10d|", 101);  // |       101| Specifying length of integer
        String str3 = String.format("|%-10d|", 101); // |101       | Left-justifying within the specified width
        String str4 = String.format("|% d|", 101);   // | 101|
        String str5 = String.format("|%010d|", 101); // |0000000101| Filling with zeroes
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    }

    public static void substringMethod() {
        String s1 = "javatpoint";
        System.out.println(s1.substring(2, 4));//returns va
        System.out.println(s1.substring(2));//returns vatpoint
    }

    public static void containsMethod() {
        String str = "String method denemeleri.";
        System.out.println(str.contains("String")); //true
        System.out.println(str.contains("")); //true

    }

    public static void joinMethod() {

        String date = String.join("/", "25", "06", "2018");
        System.out.print(date);
        String time = String.join(":", "12", "10", "10");
        System.out.println(time);
        String str = String.join(" ", "Gulten", "Deniz", "Yonkuc");
        System.out.println(str);
    }

    public static void concatMethod() {
        String s1 = "java string";
        // The string s1 does not get changed, even though it is invoking the method
        // concat(), as it is immutable. Therefore, the explicit assignment is required here.
        s1.concat("is immutable");
        System.out.println(s1);
        s1 = s1.concat(" is immutable so assign it explicitly");
        System.out.println(s1);

        String str1 = "Hello";
        String str2 = "Javatpoint";
        String str3 = "Reader";
        // Concatenating one string
        String str4 = str1.concat(str2);
        System.out.println(str4);
        // Concatenating multiple strings
        String str5 = "Deneme".concat(" ").concat(str1).concat(" ").concat(str2).concat(" ").concat(str3);
        System.out.println(str5);
    }

    public static void splitMethod(){

        String s1="java string split method by javatpoint";
        String[] words=s1.split("\\s");//splits the string based on whitespace
        //using java foreach loop to print elements of string array
        for(String w:words){
            System.out.println(w);
        }

    }

    public static void indexOfMethod(){
        String s1="this is index of example";
//passing substring
        int index1=s1.indexOf("is");//returns the index of is substring
        int index2=s1.indexOf("index");//returns the index of index substring
        System.out.println(index1+"  "+index2);//2 8

//passing substring with from index
        int index3=s1.indexOf("is",4);//returns the index of is substring after 4th index
        System.out.println(index3);//5 i.e. the index of another is

//passing char value
        int index4=s1.indexOf('s');//returns the index of s char value   (start w. 0)
        System.out.println(index4);//3
    }

    public static void valueOfMethod(){
        boolean b1=true;
        byte b2=11;
        short sh = 12;
        int i = 13;
        long l = 14L;
        float f = 15.5f;
        double d = 16.5d;
        char chr[]={'j','a','v','a'};
        String s = "Gulten";
        String s1 = String.valueOf(b1);
        String s2 = String.valueOf(b2);
        String s3 = String.valueOf(sh);
        String s4 = String.valueOf(i);
        String s5 = String.valueOf(l);
        String s6 = String.valueOf(f);
        String s7 = String.valueOf(d);
        String s8 = String.valueOf(chr);
        String s9 = String.valueOf(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);
        System.out.println(s9);
    }

    public static void trimMethod(){ //basinda ve sonunda olan bosluklari siler

// the string contains white spaces
// therefore, trimming the spaces leads to the
// generation of new string
        String str = " a bc ";

// str1 stores a new string
        String str1 = str.trim();

// the hashcode of str and str1 is different
        System.out.println(str + str.hashCode());
        System.out.println(str1 + str1.hashCode() + "\n");

// no white space present in the string s
// therefore, the reference of the s is returned
// when the trim() method is invoked
        String s = "xyz";
        String s1 = s.trim();

// the hashcode of s and s1 is the same
        System.out.println(s + s.hashCode());
        System.out.println(s1 + s1.hashCode());

    }

    public static void lowerCaseMethod(){

        String s = "JAVATPOINT HELLO stRIng";
        String eng = s.toLowerCase(Locale.ENGLISH);
        System.out.println("eng: "+eng);
        String turkish = s.toLowerCase(Locale.forLanguageTag("tr")); // It shows i without dot
        System.out.println("tr: " +turkish);


    }
}



