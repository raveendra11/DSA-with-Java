package Arrays;

public class ArraySortedorNot {

    int numbers[] = new int[]{4, 8, 13, 16, 20, 25, 28, 33, 1};

    public boolean doCheckSort() {
        for (int i = 1; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        ArraySortedorNot arsn = new ArraySortedorNot();
        if (arsn.doCheckSort()) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
    }
}
