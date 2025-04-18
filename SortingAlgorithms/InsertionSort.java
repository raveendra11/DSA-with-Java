package SortingAlgorithms;

public class InsertionSort {

    int[] numbers = {11, 13, 7, 12, 16, 9, 24, 5, 10, 3};

    public void insertionSort() {
        for (int i = 1; i < numbers.length; i++) {
            int j = i - 1;
            int x = numbers[i];
            while (j >= 0 && numbers[j] > x) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = x;
        }

        for(int k : numbers){
            System.out.println(k);
        }
    }

    public static void main(String[] args) {
        InsertionSort ins = new InsertionSort();
        ins.insertionSort();
    }
}
