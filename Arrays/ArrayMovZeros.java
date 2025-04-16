package Arrays;

import java.util.Arrays;

public class ArrayMovZeros {
    public static void moveZeros(int[] arr) {
        int index = 0; // Pointer for non-zero elements

        // First loop: Move non-zero elements forward
        for (int i : arr) {
            if (i != 0) {
                arr[index] = i;
                index++;
            }
        }

        // Second loop: Fill remaining positions with zeros
        for (int i = index; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,0,0,9,1,0,10,1,2,3,1,0,3,45};
        System.out.println("Original Array: " + Arrays.toString(arr));

        moveZeros(arr);

        System.out.println("Modified Array: " + Arrays.toString(arr));
    }
}
