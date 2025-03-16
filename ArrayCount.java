public class ArrayCount {

    int[] rollNumbers = new int[]{100, 101, 102, 103, 104, 105, 106};
    int countEven = 0;
    int countOdd = 0;

    public void doCountEvenOdd() {

        for (int i = 0; i < rollNumbers.length; i++) {

            if (rollNumbers[i] % 2 == 0)
                countEven = countEven + 1;
            else {
                countOdd = countOdd + 1;
            }

        }
        System.out.println("Even Numbers Count " + countEven);
        System.out.println("Odd Numbers Count " + countOdd);
    }


    public static void main(String[] args) {

        ArrayCount arc = new ArrayCount();
        arc.doCountEvenOdd();

    }
}
