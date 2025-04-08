public class ArrayDifference {

    int[] rollNumbers = new int[]{1, 2, 3, 4, 5, 6};

    int max = rollNumbers[0];
    int min = rollNumbers[0];
    int difference;

    public void findMax() {

        for (int i : rollNumbers) {
            if (max < i) {
                max = i;
            }
        }
        System.out.println(max);

    }

    public void findMin() {

        for (int i : rollNumbers) {
            if (min > i) {
                min = i;
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
