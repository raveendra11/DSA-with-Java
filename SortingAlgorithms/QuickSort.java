public class QuickSort{

    
    static void swap(int[] A, int x, int y) {
        int temp = A[x];
        A[x] = A[y];
        A[y] = temp;
    }

    static int partition(int[] A, int l, int h) {
        int pivot = A[l];
        int i = l;
        int j = h;

        do {
            do {
                i++;
            } while (i < A.length && A[i] <= pivot);

            do {
                j--;
            } while (A[j] > pivot);

            if (i < j) {
                swap(A, i, j);
            }

        } while (i < j);

        swap(A, l, j);

        return j;
    }
   
    static void quickSort(int[] A, int l, int h) {
        if (l < h) {
            int j = partition(A, l, h);

            quickSort(A, l, j);
            quickSort(A, j + 1, h);
        }
    }

    public static void main(String[] args) {

        
        int[] A = {11, 13, 7, 12, 16, 9, 24, 5, 10, 3, Integer.MAX_VALUE};
        int n = A.length - 1;
        quickSort(A, 0, n);
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}
