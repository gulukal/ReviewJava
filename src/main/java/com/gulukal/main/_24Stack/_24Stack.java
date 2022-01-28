package com.gulukal.main._24Stack;

import java.util.Stack;

public class _24Stack {


    public static void main(String[] args) {

        stackMethod();

    }

    public static void create(){

        Stack<Integer> stack = new Stack<>();
    }

    public static void stackMethod(){

        Stack<Integer> stack = new Stack<>();

        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);

        System.out.println(stack.peek()); // en ust degeri sorguluyor
        System.out.println(stack.pop());
        System.out.println(stack.pop()); // en ustekini al ve at alttaki ilk olsun
        System.out.println(stack.peek());
    }
}
