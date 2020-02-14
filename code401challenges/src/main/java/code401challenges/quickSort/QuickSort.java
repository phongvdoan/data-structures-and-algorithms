package code401challenges.quickSort;

public class QuickSort {

    public static void quickSort(int[] arr, int left, int right) {
        if(left >= right){
            return;
        }
            int pivot = arr[(right+left) /2];
            int position = partition(arr, left, right, pivot);
            quickSort(arr, left, position - 1);
            quickSort(arr, position, right);

    }

    public static int partition(int[] arr, int left, int right, int pivot) {

//        for (int i = left; i < right; i++) {
//////            if (arr[i] <= pivot) {
//////                low++;
//////                swap(arr,i,low);
//////            }
//////        swap(arr, right, low +1);
//////        }
//////        return low + 1;
        while(left <= right){
            while (arr[left] < pivot){
                left++;
            }
            while(arr[right] > pivot){
                right--;
            }
            if (left <= right) {

                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    public static void swap(int[] arr, int i, int low){
        int temp;
        temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
    }

}
