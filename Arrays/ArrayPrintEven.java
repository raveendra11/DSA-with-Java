package Arrays;

public class ArrayPrintEven {

    int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public void doPrintEven() {

        //first iterate all elements in the array.
        for (int k : numbers) {
            System.out.print(" "+k);
        }

        for (int i : numbers) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }


    public static void main(String[] args) {

        ArrayPrintEven ape = new ArrayPrintEven();
        ape.doPrintEven();

    }
}
