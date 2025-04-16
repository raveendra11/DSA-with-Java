package Arrays;

import java.util.Scanner;

public class ArrayDelete {

    int rollNumbers[] = new int[]{100, 101, 102, 0, 103, 104, 105, 106, 107, 0};

    int index = 0;

    public void doDelete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to delete :");
        int input = sc.nextInt();


        for (int i=0;i<rollNumbers.length;i++) {

            if (rollNumbers[i] == input) {
                rollNumbers[i] = 0;
            }
        }

        for (int j = 0; j < rollNumbers.length; j++) {

            if (rollNumbers[j] != 0) {
                rollNumbers[index] = rollNumbers[j];
                index++;
            }
        }

        for (int k = index; k < rollNumbers.length; k++) {
            rollNumbers[k] = 0;
        }

        for (int x : rollNumbers) {
            System.out.println(x);
        }

    }

    public static void main(String[] args) {

        ArrayDelete ard = new ArrayDelete();
        ard.doDelete();

    }
}
