package code401challenges;

public class BinarySearch {

    public static int binarySearch(int[] array, int searchKey){

        int leftLimit = -1;
        int rightLimit = array.length;
        while(leftLimit < rightLimit){
            int midPoint = (leftLimit+rightLimit)/2;
            if(searchKey < array[midPoint]){
                rightLimit = midPoint - 1;
            } else if(searchKey > array[midPoint]){
                leftLimit = midPoint + 1;
            } else if ( searchKey == array[midPoint]){
                return midPoint;
            }
        }
        return -1;
    }
}
