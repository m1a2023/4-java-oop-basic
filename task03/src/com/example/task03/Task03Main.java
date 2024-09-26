package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex complex = new Complex(3, 4);

        System.out.println("Original complex: " + complex);
        System.out.println("Sum complex: " + complex.add(new Complex(2, 5)));
        System.out.println("Multiplication complex: " + complex.multiply(new Complex(4, 2)));
    }
}
