package com.bytedance.algorithm;

import java.util.Arrays;

/**
 *https://www.cnblogs.com/kubidemanong/p/11334017.html
 */
public class 变形的链表反转 {
    public static void main(String[] args) {
        int[] ints = new int[1000];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i + 1;
        }
        int[] result = new int[ints.length];
        int k = 6;
        int start = ints.length - 1;
        int end = start - k;
        int sum = ints.length % k == 0 ? ints.length / k : (ints.length / k) + 1;
        for (int i = sum; i > 0; i--) {
            int count = result.length % k == 0 ? k : k + end;
            int[] temp = new int[count];
            int index = 0;
            for (int j = start; j > end; j--) {
                temp[index] = ints[j];
                index++;
            }
            if (!(count < k)) {
                for (int j = start; j > end; j--) {
                    result[j] = temp[index - 1];
                    index--;
                }
            } else {
                int tmp = 0;
                for (int j = start; j > end; j--) {
                    result[j] = temp[tmp];
                    tmp++;
                }
            }
            start = start - k;
            end = (start - k) < 0 ? -1 : start - k;
        }
        System.out.println(Arrays.toString(result));
    }
}
