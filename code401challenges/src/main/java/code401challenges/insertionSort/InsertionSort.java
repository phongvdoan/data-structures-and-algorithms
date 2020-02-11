package code401challenges.insertionSort;

import org.apache.commons.math3.exception.NullArgumentException;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        if(arr.length < 1){
            throw new NullArgumentException();
        }

        for(int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];

            while(j >= 0 && temp < arr[j]) {
                arr[j +1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
}
