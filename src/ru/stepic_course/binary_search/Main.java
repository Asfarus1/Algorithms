package ru.stepic_course.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = getArr(br);
        int[] b = getArr(br);
        StringBuilder sb = new StringBuilder();
        for (int aB : b) {
            sb.append(' ').append(binary_search(a, aB) + 1);
        }
        System.out.println(sb.substring(1));
    }

    private static int[] getArr(BufferedReader br) throws IOException {
        String[] lineArgs = br.readLine().split(" ");
        int len = Integer.valueOf(lineArgs[0]);
        int[] arr =  new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.valueOf(lineArgs[i + 1]);
        }
        return arr;
    }

    private static int binary_search(int[] arr, int val){
        int start = 0, end = arr.length, mid;
        while (start < end){
            mid = (end + start) / 2;
            if (arr[mid] == val){
                return mid;
            }else if (arr[mid] < val){
                start = mid + 1;
            }else {
                end = mid;
            }
        }
        return -2;
    }
}
