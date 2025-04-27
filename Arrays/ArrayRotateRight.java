package Arrays;

public class ArrayRotateRight {

    int rollNumbers[] = new int[]{1, 2, 3, 4, 5, 6};

    int temp = rollNumbers[rollNumbers.length - 1];

    public void doRotateRight() {

        for (int i = rollNumbers.length - 1; i > 0; i--) {

            rollNumbers[i] = rollNumbers[i - 1];


        }

        rollNumbers[0] = temp;

        for (int j : rollNumbers) {
            System.out.println(j);
        }

    }

    public static void main(String[] args) {
        ArrayRotateRight arr = new ArrayRotateRight();
        arr.doRotateRight();
    }
}
