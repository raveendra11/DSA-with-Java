public class ArrayDuplicate {

    int[] rollNumbers = new int[]{101, 103, 100, 100, 104, 101, 103, 107, 107};

    public void findDuplicate() {

        for (int i = 0; i < rollNumbers.length; i++) {

            for (int j = i + 1; j < rollNumbers.length; j++) {

                if (rollNumbers[i] == rollNumbers[j]) {
                    System.out.println(rollNumbers[i]);
                }
            }
        }
    }

    public static void main(String[] args) {

        ArrayDuplicate ard = new ArrayDuplicate();
        ard.findDuplicate();
    }
}
