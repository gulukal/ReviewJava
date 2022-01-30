package com.gulukal.main._29Inheritance;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder

public class Student extends People implements Workable, Triable {

    private int number;

    @Override
    public void work() {
        System.out.println("Student work while eating " + eat());

    }

    @Override
    public String eat() {
        return "Apple";
    }

    //lombok extends edilmis sinif degiskenlerini getirmiyor ve build a musade etmiyor bu sekilde kullan

    public Student(String name, String surName, int age, int number) {
        super(name, surName, age);
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", surName='" + getSurName() + '\'' +
                ", age=" + getAge() +
                ", number=" + number +
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

    @Override
    public void try4() {
        Triable.super.try4();
    }
}
