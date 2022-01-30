package com.gulukal.main._06String;

import org.openjdk.jol.vm.VM;

public class TestString {

    public static void main(String[] args) {

          //compareString();
        equalObject();
    }

    public static void equalObject() {


        Client client1 = new Client(25);
        Client client2 = new Client(25);
        Client client3 = client1;
        //client1 and client2 are pointing to different client objects.
        //client1 and client3 are pointing to same client objects.
        System.out.println(client1 == client2); //false
        System.out.println(client1 == client3); //true

        System.out.println(client1.equals(client2)); //false
        System.out.println(client1.equals(client3)); //true


        System.out.println(client1!=client2); //true
    }

    public static void compareString() {

        String str = "deniz";
        String str1 = new String("deniz");
        String str2 = "deniz";


        System.out.println(VM.current().addressOf(str));  //same
        System.out.println(VM.current().addressOf(str1)); //different
        System.out.println(VM.current().addressOf(str2)); //same


        System.out.println(str.equals(str1));   //true
        System.out.println(str1.equals(str2));  //true
        System.out.println(str.equals(str2));   //true


        System.out.println(str == str1);     //false
        System.out.println(str1 == str2);   //false
        System.out.println(str == str2);    //true
    }
}
