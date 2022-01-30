package com.gulukal.main._29Inheritance;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder

public class Teacher extends People implements Workable,Triable {


    @Override
    public void work() {

        System.out.println("Teacher work while eating " + eat());

    }

    @Override
    public String eat() {
        return "Banana";
    }

    //lombok extends edilmis sinif degiskenlerini getirmiyor ve build a musade etmiyor bu sekilde kullan

    public Teacher(String name, String surName, int age) {
        super(name, surName, age);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + getName() + '\'' +
                ", surName='" + getSurName() + '\'' +
                ", age=" + getAge() +
                ", eat='" + eat() + '\'' +
                '}';
    }

    @Override
    public void try1() {
        Triable.super.try1();
    }

    @Override
    public void try2() {

    }

    @Override
    public void try3() {

    }
}
