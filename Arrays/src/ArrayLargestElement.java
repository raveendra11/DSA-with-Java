public class ArrayLargestElement {

    int marks[] = new int[]{30, 35, 1, 100, 57, 23, 101};

    int max = marks[0];

    public void findLargest() {

        for (int i : marks) {
            if (max < i) {
                max = i;
            }
        }
        System.out.println(max);

    }

    public static void main(String[] args) {

        ArrayLargestElement arl = new ArrayLargestElement();
        arl.findLargest();
    }
}
