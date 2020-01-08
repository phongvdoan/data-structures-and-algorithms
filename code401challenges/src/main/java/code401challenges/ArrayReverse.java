package code401challenges;

public class ArrayReverse {
  public static void main(String[] arg) {
    int[] array1 = { 1, 2, 3, 4, 5, 6 };
    reverseArray(array1);
    for (int i = 0; i < array1.length; i++) {
        System.out.println(array1[i]);
    }

  }

  public static int[] reverseArray(int[] array) {
    if (array.length > 1) {
      for (int i = 0; i < (array.length - 1) / 2; i++) {
        int previousValue = array[array.length - i - 1];
        array[array.length - i - 1] = array[i];
        array[i] = previousValue;
      }
    }
    return array;
  }
}