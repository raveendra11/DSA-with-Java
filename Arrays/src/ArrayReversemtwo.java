public class ArrayReversemtwo {

    int numbers[] = new int[]{1, 2, 3, 4, 5, 6};

    public void doReverse() {


        for (int i = 0, j = numbers.length - 1; i < j; i++, j--) {

            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }

        for (int x : numbers) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {

        ArrayReversemtwo ard = new ArrayReversemtwo();
        ard.doReverse();

    }
}
