public class ArrayMissingElement {

    int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 8, 9, 10};


    int n = numbers[numbers.length - 1];

    int total = 0;

    public void findMissing() {

        for (int x : numbers) {
            total = total + x;
        }
        n = n * (n + 1);
        n = n / 2;
        int missingNumber = n - total;
        System.out.println(missingNumber);
    }

    public static void main(String[] args) {

        ArrayMissingElement arme = new ArrayMissingElement();
        arme.findMissing();

    }
}
