package Arrays;

public class ArrayPairSummtwo {

    int[] numbers = new int[]{6, 3, 8, 10, 16, 7, 5, 2, 9, 14};
    int[] numbers2 = new int[100];  // Increased size to handle larger values
    int sum = 10;

    public void doPairSum() {
        for (int i = 0; i < numbers.length; i++) {
            int complement = sum - numbers[i];
            if (complement >= 0 && numbers2[complement] != 0) {
                System.out.println(numbers[i] + " + " + complement + " = " + sum);
            }
            numbers2[numbers[i]] = 1; // Mark this number as seen
        }
    }

    public static void main(String[] args) {
        ArrayPairSummtwo arp = new ArrayPairSummtwo();
        arp.doPairSum();
    }
}
