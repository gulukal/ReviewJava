package com.gulukal.main._27Modifiers.Example;

public class Person {

//    Final modifier can be used with variable, method and class.
//    if variable is declared final then we cannot change its value.
//    If method is declared final then it can not be overridden and
//    if a class is declared final then we can not inherit it.

    private String name;
    private String surName;
    private int age;
    public String address;
    public static String city;

    public static void main(String[] args) {

        publicStaticMethod(city);
        Person person = new Person();

        person.publicClass(person.name);
        person.defaultClass();
        person.protectedMethod();
        person.privateClass();
    }

    public static void publicStaticMethod(String str){
        System.out.println("Public Static Method");
    }

    public void publicClass(String str){

        System.out.println("Public Method");
    }

    private void privateClass(){
        System.out.println("Private Method");
    }

    void defaultClass(){
        System.out.println("Default Method");

    }
    protected void protectedMethod(){
        System.out.println("Protected Method");
    }



}

