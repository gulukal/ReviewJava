package com.gulukal.main._29Inheritance;

public class TestInheritance {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Gulten", "Ulukal", 34);
        Teacher teacher1 = Teacher.builder().name("Ozgur").surName("Yonkuc").age(36).build();


        Student student = Student.builder().name("Deniz").surName("Yonkuc").age(2).number(3).build();


        System.out.println("Teacher: " + teacher);
        System.out.println("Teacher: " + teacher1);
        System.out.println("Student: " + student);
    }
}
