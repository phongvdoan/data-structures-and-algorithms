package code401challenges.mergeSort;


import java.util.Arrays;

public class MergeSort {

    public static int[] merge(int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] arr = new int[left.length + right.length];

        while (i < left.length && j < right.length){
            if(left[i] < right[j]){
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            arr[k] = right[j];
            j++;
            k++;
        }
        return arr;
    }

    public static int[] mergeSort(int[] arr){

        if(arr.length <= 1) {
            return arr;
        }
        int length = arr.length;
        int mid = length/2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        return merge(mergeSort(left),mergeSort(right));

    }


}
