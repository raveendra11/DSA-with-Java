public class ArrayMovZeros {

    int rollNumbers[] = new int[]{100, 101, 0, 0, 0, 200, 0, 0, 104, 105, 102, 0, 103};

    public void doMovZeros() {
        int nonZeroIndex = 0; // Pointer to place non-zero elements

        // Pass 1: Move non-zero elements forward
        for (int i = 0; i < rollNumbers.length; i++) {
            if (rollNumbers[i] != 0) {
                int temp = rollNumbers[i];
                rollNumbers[i] = rollNumbers[nonZeroIndex];
                rollNumbers[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }

        // Print the modified array
        for (int x : rollNumbers) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        ArrayMovZeros amz = new ArrayMovZeros();
        amz.doMovZeros();
    }
}