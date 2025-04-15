public class ArrayBinarySearch {

    int[] rollNumbers = new int[]{4, 8, 10, 15, 18, 21, 24, 27, 29};

    int key = 21;
    int low = 0;

    int high = rollNumbers.length - 1;


    public int doBinarySearch() {

        for (; low <= high; ) {

            int mid = (low + high) / 2;

            if (rollNumbers[mid] == key) {
                return mid;
            } else if (key < rollNumbers[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        ArrayBinarySearch arbs = new ArrayBinarySearch();
        System.out.println(arbs.doBinarySearch());


    }
}
