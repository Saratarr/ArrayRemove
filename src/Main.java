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

    public static boolean arrayContains(int[] arr, int val) {
        for (int i : arr) {
            if (i == val) {
            return true;
            }
        }
        return false;
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

    public static int[] arrayAppend(int[] arr, int val) {
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        newArray[newArray.length - 1] = val;
        return newArray;
    }

    public static int[] removedDupes(int[] arr) {
        int[] rDupes = new int[0];
        for (int i : arr) {
            if (!arrayContains(rDupes, i)) {
                rDupes = arrayAppend(rDupes, i);
            }
        }
        return rDupes;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 3, 4};

        printArray(nums);
        // System.out.println("The given value is a duplicate? " + numIsDupe(nums, 1));
        // System.out.println("The index position of the last duplicate is " + lastIndex(nums, 1));
        printArray(removedDupes(nums));
    }
}