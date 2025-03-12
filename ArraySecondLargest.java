public class ArraySecondLargest {

    int[] rollNumbers = new int[]{1, 198, 199, 1, 2, 100, 102, 200, 101, 333};

    public void findSecondLargest() {


        int max = rollNumbers[0];

        for (int i = 0; i < rollNumbers.length; i++) {

            if (max < rollNumbers[i]) {
                max = rollNumbers[i];
            }
        }
        System.out.println(max);

        int secondMax = rollNumbers[0];

        for (int j = 0; j < rollNumbers.length; j++) {

            if (rollNumbers[j] > secondMax && rollNumbers[j] < max) {
                secondMax = rollNumbers[j];
            }
        }
        System.out.println(secondMax);
    }

    public static void main(String[] args) {

        ArraySecondLargest sl = new ArraySecondLargest();
        sl.findSecondLargest();

    }
}
