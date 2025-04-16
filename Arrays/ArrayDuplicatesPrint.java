package Arrays;

public class ArrayDuplicatesPrint {

    int[] numbers = new int[]{3, 6, 8, 8, 10, 12, 15, 15, 15, 20, 20, 20, 21, 21};

    int duplicate;

    public void printDuplicates() {

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1] && numbers[i + 1] != duplicate) {
                duplicate = numbers[i];
                System.out.println(duplicate);
            }
        }
    }

    public static void main(String[] args) {

        ArrayDuplicatesPrint ard = new ArrayDuplicatesPrint();
        ard.printDuplicates();

    }
}
