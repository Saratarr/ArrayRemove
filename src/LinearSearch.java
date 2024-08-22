
public class LinearSearch {
    // Linear-search function to find the index of an element 
    public static int findIndex(int arr[], int t) {
        // if array is Null 
        if (arr == null) {
            return -1;
        }

        // find length of array 
        int len = arr.length; // This is the key -- need to set a variable that is the array length!
        int i = 0;

        // traverse in the array 
        while (i < len) {
            // if the i-th element is t 
            // then return the index 
            if (arr[i] == t) {
                return i;
            } else { i = i + 1; }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] my_array = { 5, 4, 6, 1, 3, 2, 7, 8, 9 };
        // find the index of 5 
        System.out.println("Index position of 5 is: "
                + findIndex(my_array, 5));
        // find the index of 7 
        System.out.println("Index position of 7 is: "
                + findIndex(my_array, 7));
    }
} 