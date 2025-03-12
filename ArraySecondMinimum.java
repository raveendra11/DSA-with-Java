public class ArraySecondMinimum {

    int marks[] = new int[]{23, 12, 9, 43, 56, 11, 32, 65, 75};

    int min = marks[0];

    int secondMin = marks[0];

    public void findSecondMinimum() {

        for (int i = 0; i < marks.length; i++) {
            if (min > marks[i]) {
                min = marks[i];

            }
        }
        System.out.println(min);

        for (int j = 0; j < marks.length; j++) {
            if (marks[j] < secondMin && marks[j] > min) {

                secondMin = marks[j];

            }
        }

        System.out.println(secondMin);
    }

    public static void main(String[] args) {

        ArraySecondMinimum sml = new ArraySecondMinimum();
        sml.findSecondMinimum();
    }
}
