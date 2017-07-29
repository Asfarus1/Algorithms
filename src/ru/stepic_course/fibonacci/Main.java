package ru.stepic_course.fibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        System.out.println(Fib(n));
    }

    private static int Fib(int n) {
        int a = 0, b = 1;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 1) {
                a = a + b;
            } else {
                b = a + b;
            }
        }
        return n % 2 == 1 ? b : a;
    }
}
