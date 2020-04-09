package com.bytedance.algorithm;

import java.util.Arrays;

/**
 * https://www.xttblog.com/?p=4385
 */
public class 最优平均分法 {
    public static void main(String[] args) {
        int a = 10;//原数
        int b = 3;//份数
        int c = a % b;
        int[] arr = new int[b];
        if (c == 0) {
            int e = a / b;
            for (int i = 0; i < b; i++) {
                arr[i] = e;
            }
        } else {
            int d = a + (b - c);//余数肯定比份数小
            int e = d / b;
            for (int i = 0; i < b; i++) {
                arr[i] = e;
            }
            arr[0] = arr[0] - (b - c);
        }
        System.out.println(Arrays.toString(arr));
    }
}
