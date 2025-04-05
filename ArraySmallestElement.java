public class ArraySmallestElement {

    int marks[] = new int[]{95, 83, 68, 34, 100, 99, 90};

    int min = marks[0];

    public void findSmallest() {

        for (int i : marks) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {

        ArraySmallestElement ars = new ArraySmallestElement();
        ars.findSmallest();
    }
}
