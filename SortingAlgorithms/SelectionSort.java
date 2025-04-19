package SortingAlgorithms;

public class SelectionSort {

    int numbers[] = new int[]{5, 1, 6, 2, 9, 12, 4};

    public void doSelectionSort() {
        int i, j, k;
        for (i = 0; i < numbers.length - 1; i++) {
            for (j = k = i; j < numbers.length; j++) {
                if (numbers[j] < numbers[k]) {
                    k = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[k];
            numbers[k] = temp;
        }

        for (int l : numbers) {
            System.out.println(l);
        }
    }

    public static void main(String[] args) {
        SelectionSort als = new SelectionSort();
        als.doSelectionSort();
    }
}
