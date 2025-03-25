public class ArrayReverse {

    int numbers[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

    int srebmun[] = new int[9];

    int j = 0;
    int c = 0;

    public void doReverse() {

        for (int i = numbers.length - 1; i >= 0; i--) {
            srebmun[j] = numbers[i];
            j++;
        }


        for (int k = 0; k < srebmun.length; k++) {
            numbers[c] = srebmun[k];
            c++;
        }

        for (int x : numbers) {
            System.out.println(x);
        }


    }

    public static void main(String[] args) {

        ArrayReverse arr = new ArrayReverse();
        arr.doReverse();
    }
}
