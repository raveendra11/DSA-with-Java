public class ArrayPrintEven {

    int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public void doPrintEven() {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }

    }


    public static void main(String[] args) {

        ArrayPrintEven ape = new ArrayPrintEven();
        ape.doPrintEven();

    }
}
