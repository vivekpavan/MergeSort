package com.MergeSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {4,3,8,6,2,9};
        var merge = new MergeSort();
        merge.MergeSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
