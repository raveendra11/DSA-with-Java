import java.util.Arrays;

public class ArrayMovZeros {
    public static void moveZeros(int[] arr) {
        int index = 0; // Pointer for non-zero elements

        // First loop: Move non-zero elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Second loop: Fill remaining positions with zeros
        for (int i = index; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,0,0,9,1,0};
        System.out.println("Original Array: " + Arrays.toString(arr));

        moveZeros(arr);

        System.out.println("Modified Array: " + Arrays.toString(arr));
    }
}
