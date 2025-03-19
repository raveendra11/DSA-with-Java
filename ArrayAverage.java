public class ArrayAverage {

    int[] marks = new int[]{1, 2, 3, 4, 5};
    int total;

    public void doAverage() {
        for (int i = 0; i < marks.length; i++) {
            total = marks[i] + total;
        }
        System.out.println(total / marks.length);
    }


    public static void main(String[] args) {

        ArrayAverage ara = new ArrayAverage();
        ara.doAverage();

    }
}

