public class ArrayThirdLargest {

    int[] numbers = new int[]{1, 2, 3, 4, 55, 12, 67, 123, 56, 5, 6, 7, 8, 9, 10};

    int largest = numbers[0];

    int secondLargest = numbers[0];

    int thirdlargest = numbers[0];

    public void findThirdLargest() {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        for (int j = 1; j < numbers.length; j++) {
            if (numbers[j] > secondLargest && numbers[j] < largest) {
                secondLargest = numbers[j];

            }
        }

        for (int k = 1; k < numbers.length; k++) {
            if (numbers[k] > thirdlargest && numbers[k] < secondLargest) {
                thirdlargest = numbers[k];
            }
        }
        System.out.println(thirdlargest);
        System.out.println(secondLargest);
        System.out.println(largest);
    }

    public static void main(String[] args) {

        ArrayThirdLargest artl = new ArrayThirdLargest();
        artl.findThirdLargest();

    }
}
