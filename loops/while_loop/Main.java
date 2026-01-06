package com.example;

public class Main {
    public static int sumFrom1ToN(int n) {
        int sum = 0;
        int current = 0;

        while (n >= current) {
            sum = sum + current;
            current = current + 1;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 10;
        int result = sumFrom1ToN(n);
        System.out.println("The sum of numbers from 1 to " + n + " is: " + result);
    }
}
