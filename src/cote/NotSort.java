package cote;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NotSort {
    public static void main(String[] args) {
//        int[] org = {4, 2, 3, 1, 5};
//        int[] sorted = solution(org);
//
////        System.out.println(Arrays.toString(solution(new int []{4, 2, 3, 1, 5})));
//        System.out.println(Arrays.toString(org));
//        System.out.println(Arrays.toString(sorted));

        int[] arr = new int [100000];
        long start = System.currentTimeMillis();
        int[] bubble = bubbleSort(arr);
    }

    private static int[] solution(int[] arr) {
        int[] clone = arr.clone();
        Arrays.sort(clone);

        return clone;
    }

    private static int[] bubbleSort(int[] org) {
        int[] arr = org.clone();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i -1; j++){

            }
        }
        return arr;
    }
}
