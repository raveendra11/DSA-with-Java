package Arrays;

public class ArraySortedorNotEnhance {

    int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 0};

    public boolean doCheckSort() {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        ArraySortedorNotEnhance arst = new ArraySortedorNotEnhance();
        if (arst.doCheckSort()) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }

    }
}
