public class ArrayBubbleSort {

    int numbers[] = new int[]{1, 8, 5, 7, 3, 2,9};

    public void doBubbleSort() {

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length-1-i; j++) {

                if(numbers[j]>numbers[j+1]){
                    int temp = numbers[j+1];
                    numbers[j+1]=numbers[j];
                    numbers[j]=temp;
                }

            }
        }
        for (int k : numbers) {
            System.out.println(k);
        }
    }

    public static void main(String[] args) {

        ArrayBubbleSort arb = new ArrayBubbleSort();
        arb.doBubbleSort();

    }
}