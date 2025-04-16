package Arrays;

public class ArraySum {

    int[] numbers = new int[]{1, 2, 3, 4, 5, 6};

    int sum = 0;

    public void doAdd() {

        for (int i : numbers) {

            sum = sum + i;

        }

        System.out.println(sum);

    }

    public static void main(String[] args) {

        ArraySum ars = new ArraySum();
        ars.doAdd();

    }
}
