import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void printArray(int[] arr) { // Prints out int[] nums
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static Object numIsDupe(int[] arr, int val) { // Identify if value is duplicated
        boolean trackNum = false;
        for (int i : arr) {
            if (i == val) {
                if (trackNum) {
                    return val;
                }
                trackNum = true;
            }
        }
        return trackNum;
    }

    public static int lastIndex(int[] arr, int val) { // Identify last index position of value
        int len = arr.length;

        for (int i = len - 1; i >= 0; i--) {
            if (i == val) {
                return i;
            }
        }
        return -1;
    }

    public static int[] removedDupes(int[] arr) {
        List<Integer> rDupes = new ArrayList<>();
        // Iterate through rDupes 1 instance of every value in arr
        for (int i : arr) {
            // 
        }

        int[] array = new int[rDupes.size()];
        for (int i = 0; i < rDupes.size(); i++) {
            array[i] = rDupes.get(i);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 3, 4};

        printArray(nums);
        System.out.println("The given value is a duplicate? " + numIsDupe(nums, 4));
        System.out.println("The index position of the last duplicate is " + lastIndex(nums, 4));
    }
}