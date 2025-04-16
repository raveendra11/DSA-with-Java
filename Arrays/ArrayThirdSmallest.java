package Arrays;

public class ArrayThirdSmallest {

    int numbers[] = new int[]{23, 12, 4, 32, 11, 54, 52, 23, 86, 22};

    int smallest = numbers[0];
    int secondSmallest = numbers[0];
    int thirdSmallest = numbers[0];

    public void findThirdSmallest() {

        for (int i : numbers) {
            if (i < smallest) {
                smallest = i;
            }
        }

        for (int j = 1; j < numbers.length; j++) {
            if (numbers[j] < secondSmallest && numbers[j] > smallest) {
                secondSmallest = numbers[j];

            }
        }

        for (int k = 1; k < numbers.length; k++) {
            if (numbers[k] < thirdSmallest && numbers[k] > secondSmallest) {
                thirdSmallest = numbers[k];
            }
        }
        System.out.println(thirdSmallest);
        System.out.println(secondSmallest);
        System.out.println(smallest);
    }


    public static void main(String[] args) {

        ArrayThirdSmallest artd = new ArrayThirdSmallest();
        artd.findThirdSmallest();

    }
}
