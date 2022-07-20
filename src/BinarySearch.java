import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] array, int left, int right ,int value) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (value == array[mid]) {
            return mid;
        }
        else if (value < array[mid]) {
            return binarySearch(array, left, mid - 1, value);
        }
        else {
            return binarySearch(array, mid + 1, right, value);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 16, 6, 8, 9, 55, 11, 3, 5, 4};
        int key = 6;
        int left = 0;
        int right = array.length - 1;
        Arrays.sort(array);
        int index = binarySearch(array, left, right, key);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        }
        else {
            System.out.println("Element not found in the array");
        }
    }


}
