package ru.stepic_course.fibonacci_rem_of_div;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArgs = br.readLine().split(" ");
        long n = Long.valueOf(strArgs[0]);
        int m = Integer.valueOf(strArgs[1]);
        int[] pisano = findPisano(n, m);
        System.out.println(pisano == null ? n % m : pisano[(int) (n % pisano.length)]);
    }

    private static int[] findPisano(long n, int m) {
        if (n < 2) {
            return null;
        }

        List<Integer> res = new ArrayList<>();
        res.add(0);
        res.add(1);

        int n1 = 0, n2 = 1, r;

        for (int i = 0; i < n; i++) {
            r = (n2 + n1) % m;
            n1 = n2;
            n2 = r;
            if (n2 == 1 && res.get(res.size() - 1) == 0) {
                break;
            }
            res.add(r);
        }
        return res.stream().limit(res.size() - 1).mapToInt(Integer::intValue).toArray();
    }
}
