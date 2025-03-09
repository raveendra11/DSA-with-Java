public class ArrayLargestElement {

    int marks[] = new int[]{30, 35, 1, 100, 57, 23, 101};

    int max = marks[0];

    public void findLargest() {

        for (int i = 1; i < marks.length; i++) {
            if (max < marks[i]) {
                max = marks[i];
            }
        }
        System.out.println(max);

    }

    public static void main(String[] args) {

        ArrayLargestElement arl = new ArrayLargestElement();
        arl.findLargest();
    }
}
