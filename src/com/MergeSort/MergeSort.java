package com.MergeSort;

public class MergeSort {
    public void MergeSort(int[] array){
        if(array.length < 2)
            return;
        var half = array.length/2;
        int[] left = new int[half];
        int[] right = new int[array.length - half];
        for(var i = 0;i < half;i++)
            left[i] = array[i];

        for(var i = half;i < array.length;i++)
            right[i - half] = array[i];

        MergeSort(left);
        MergeSort(right);

        Merge(left,right,array);
    }
    private void Merge(int[] left,int[] right,int[] array){
        int i = 0;int j = 0;int k = 0;
        while(i < left.length && j < right.length){
            if(left[i] < right[j])
                array[k++] = left[i++];
            else
                array[k++] = right[j++];
        }
        while(i < left.length)
            array[k++] = left[i++];
        while(j < right.length)
            array[k++] = right[j++];
    }
}
