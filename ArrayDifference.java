public class ArrayDifference {

    int[] rollNumbers = new int[]{1, 2, 3, 4, 5, 6};

    int max = rollNumbers[0];
    int min = rollNumbers[0];
    int difference;

    public void findMax() {

        for (int i = 0; i < rollNumbers.length; i++) {
            if (max < rollNumbers[i]) {
                max = rollNumbers[i];
            }
        }
        System.out.println(max);


    }

    public void findMin() {

        for (int i = 0; i < rollNumbers.length; i++) {
            if (min > rollNumbers[i]) {
                min = rollNumbers[i];
            }
        }
        System.out.println(min);
    }

    public void findDifference() {
        difference = max - min;
        System.out.println(difference);
    }


    public static void main(String[] args) {
        ArrayDifference ard = new ArrayDifference();
        ard.findMax();
        ard.findMin();
        ard.findDifference();
    }
}
