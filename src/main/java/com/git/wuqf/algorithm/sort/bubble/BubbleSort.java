package com.git.wuqf.algorithm.sort.bubble;

import com.git.wuqf.algorithm.sort.Sort;

/**
 * Created by wuqf on 2020/5/14.
 * 冒泡排序算法
 */
public class BubbleSort implements Sort {

    @Override
    public int[] sort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.println("index is :" + j + "," + (j + 1) + " . element is :" + arr[j] + "," + arr[j + 1]);
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
}
