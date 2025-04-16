package Arrays;

public class ArrayPairSum {

    int[] numbers = new int[]{6, 3, 8, 10, 16, 7, 5, 2, 9, 14};

    int sum = 10;

    public void foFindPair() {

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == sum) {
                    System.out.println("Pair is " + numbers[i] + " , " + numbers[j]);
                }
            }
        }
    }

    public static void main(String[] args) {

        ArrayPairSum arp = new ArrayPairSum();
        arp.foFindPair();

    }
}
