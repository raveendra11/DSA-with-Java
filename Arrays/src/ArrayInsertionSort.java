import java.util.Arrays;

public class ArrayInsertionSort {
    public static void insertionSort(int[] A) {
        int n = A.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int x = A[i];
            while (j >= 0 && A[j] > x) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = x;
        }
    }

    public static void main(String[] args) {
        int[] A = {11, 13, 7, 12, 16, 9, 24, 5, 10, 3};
        insertionSort(A);
        System.out.println(Arrays.toString(A));
    }
}
