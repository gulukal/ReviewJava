package com.gulukal.main._29Inheritance;


//interface Triable{}
//interface can extends other interface
public abstract interface Triable extends Workable{

    //0 puplic static govdeli
    public static void try0() {
        System.out.println("public static void govdeli method");
    }

    //1 puplic default govdeli
    public default void try1() {
        System.out.println("public default void govdeli method");
    }

    //2 public govdesiz
    public void try2();

    //3 public govdesiz (no need to write public) -->try2
    void try3();

    //4 default govdeli (no need to write public) -->try1
    default void try4() {
        System.out.println("The same method with try1()");
    }
}
