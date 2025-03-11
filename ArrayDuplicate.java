public class ArrayDuplicate {

    int[] rollNumbers = new int[]{101, 102, 100, 104, 107, 106, 107};

    int duplicate = rollNumbers[0];

    public void findDuplicate() {

        for (int i = 1; i < rollNumbers.length; i++) {

            if (duplicate == rollNumbers[i]) {
                System.out.println(rollNumbers[i]);
                break;
            }
            if (i == rollNumbers.length - 1) {
                duplicate = rollNumbers[i];
                i = 0;

            }
        }
    }

    public static void main(String[] args) {

        ArrayDuplicate ard = new ArrayDuplicate();
        ard.findDuplicate();
    }
}
