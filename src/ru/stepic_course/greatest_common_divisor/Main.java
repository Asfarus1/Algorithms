package ru.stepic_course.greatest_common_divisor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lineArgs = br.readLine().split(" ");

        int x = Integer.valueOf(lineArgs[0]);
        int y = Integer.valueOf(lineArgs[1]);
        System.out.println(gcd(x, y));
    }

    private static int gcd(int x, int y){
        int d, a, b;
        if (x > y){
            a = x;
            b = y;
        }else {
            b = y;
            a = x;
        }

        for(;;) {
            d = a % b;
            if (d == 0){
                return b;
            }
            a = b;
            b = d;
        }
    }
}
