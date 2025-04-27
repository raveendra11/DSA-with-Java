package Arrays;

public class ArrayRotateLeft {

    int[] rollNumbers = new int[]{1, 2, 3, 4, 5, 6, 7};

    int temp = rollNumbers[0];

    public void doRotate() {
        for (int i = 0; i < rollNumbers.length - 1; i++) {
            rollNumbers[i] = rollNumbers[i + 1];
        }
        rollNumbers[rollNumbers.length - 1] = temp;

        for (int k : rollNumbers) {
            System.out.println(k);
        }

    }

    public static void main(String[] args) {

        ArrayRotateLeft art = new ArrayRotateLeft();
        art.doRotate();

    }
}
