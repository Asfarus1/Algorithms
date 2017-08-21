package ru.stepic_course.func_grow_rate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Function;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) throws IOException {
        class funcView{
            String view;
            Function<Integer, Double> func;

            funcView(String view, Function<Integer, Double> func) {
                this.view = view;
                this.func = func;
            }
        };

        List<funcView> list = new ArrayList<>();

        list.add(new funcView("log3(n)", n-> log(n)/ log(3)));
        list.add(new funcView("(log2(n))^2", n-> pow(log(n),2)));
        list.add(new funcView("7^log2(n)", n-> pow(7, log(n))));
        list.add(new funcView("3^log2(n)", n-> pow(3, log(n))));
        list.add(new funcView("log2(n)^log2(n)", n-> pow(log(n), log(n))));
        list.add(new funcView("n!", Main::fact));
        list.add(new funcView("n^(n^(1/2))", n-> pow(n, sqrt(n))));
        list.add(new funcView("2^n", n-> pow(2,n)));
        list.add(new funcView("n^log2(n)", n-> pow(n, log(n))));
        list.add(new funcView("4^n", n-> pow(4,n)));
        list.add(new funcView("log2(n!)", n-> log(fact(n))));
        list.add(new funcView("2^(3*n)", n-> pow(2, 3*n)));
        list.add(new funcView("log2(log2(n))", n-> log(log(n))));
        list.add(new funcView("2^2^n", n-> pow(2,pow(2,n))));
        list.add(new funcView("n/log5(n)", n-> n/log(n)/log(5)));
        list.add(new funcView("n^(1/2)", Math::sqrt));
        list.add(new funcView("log4(n)^(1/2)", n -> sqrt(log(n)/log(4))));
        list.add(new funcView("n^2", n -> pow(n,2)));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lineArgs = br.readLine().split(" ");

        int x = Integer.valueOf(lineArgs[0]);
        int y = Integer.valueOf(lineArgs[1]);
        System.out.println(gcd(x, y));
    }

    private static Double fact(Integer n) {
        double res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
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
