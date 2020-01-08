package code401challenges;

import java.util.Arrays;

public class ArrayShift {
    public static void main(String[] args) {

    }

    public static int[] insertShiftArray(int[] initialArray, int num) {
        int[] newArr = new int[initialArray.length + 1];
        int halfOfLengthOfNewArr = newArr.length / 2;
        for(int i = 0; i < newArr.length; i++)
            if (i < halfOfLengthOfNewArr){
                newArr[i] = initialArray[i];
            } else if (i == halfOfLengthOfNewArr){
                newArr[i] = num;
            } else {
                newArr[i] = initialArray[i-1];
            }
        return newArr;
    }
}
