package Arrays;

public class ArrayMerge {

    int[] rollNumbers1 = new int[]{3, 8, 16, 20, 25};
    int[] rollNumbers2 = new int[]{4, 10, 12, 22, 23};
    int[] rollNumbers3 = new int[rollNumbers1.length + rollNumbers2.length];

    public void doMerge() {
        int i = 0, j = 0, k = 0;

        // Merging both arrays using a for loop
        for (; i < rollNumbers1.length && j < rollNumbers2.length; k++) {
            if (rollNumbers1[i] < rollNumbers2[j]) {
                rollNumbers3[k] = rollNumbers1[i];
                i++;
            } else {
                rollNumbers3[k] = rollNumbers2[j];
                j++;
            }
        }

        // Copy remaining elements of rollNumbers1 (if any)
        for (; i < rollNumbers1.length; i++, k++) {
            rollNumbers3[k] = rollNumbers1[i];
        }

        // Copy remaining elements of rollNumbers2 (if any)
        for (; j < rollNumbers2.length; j++, k++) {
            rollNumbers3[k] = rollNumbers2[j];
        }

        // Printing the merged array using a for loop
        for (int x = 0; x < rollNumbers3.length; x++) {
            System.out.print(rollNumbers3[x] + " ");
        }
    }

    public static void main(String[] args) {
        ArrayMerge arm = new ArrayMerge();
        arm.doMerge();
    }
}
