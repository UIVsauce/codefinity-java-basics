package com.example;

public class Main {
    public static boolean tryConnect(int successfulAttempt) {
        int retryCount = 0;
        do {
            // The solution can be multiple lines long
            retryCount = retryCount++;
            
        } while (retryCount < 5);

        successfulAttempt = 3;

        return successfulAttempt;
    }

    public static void main(String[] args) {
        boolean connected = tryConnect(3); // simulate successful attempt on 3rd try
        if (!connected) {
            System.out.println("Failed to connect to the server after 5 attempts.");
        }
    }
}
