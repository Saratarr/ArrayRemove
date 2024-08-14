import java.util.Arrays;

public class Main {

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static boolean numIsDupe(int[] arr, int val) {
        boolean trackNum = false;
        for (int i : arr) {
            if (i == val) {
                if (trackNum == true) {
                    return true;
                }
                trackNum = true;
            }
        }
        return false;
    }

    public static int dupeIndex(int[] arr, int val) { // Identify index position of a chosen value, return last position
        for (int i : arr) {
            if (i == val) {
                return null;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 3, 4};

        printArray(nums);
        System.out.println(numIsDupe(nums, 2));
    }
}