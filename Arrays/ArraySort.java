package Arrays;

public class ArraySort {

    int[] rollNumbers = new int[]{8,5,7,3,2};

    public void doSort() {
        for (int i = 0; i < rollNumbers.length - 1; i++) {
            for (int j = i + 1; j < rollNumbers.length; j++) {
                if (rollNumbers[i] > rollNumbers[j]) {
                    // Swap values properly
                    int temp = rollNumbers[i];
                    rollNumbers[i] = rollNumbers[j];
                    rollNumbers[j] = temp;
                }
            }
        }
        for (int x : rollNumbers) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {

        ArraySort ars = new ArraySort();
        ars.doSort();

    }
}
