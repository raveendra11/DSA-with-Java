package Arrays;

public class ArrayAverage {

    int[] marks = new int[]{1, 2, 3, 4, 5};
    int total;

    public void doAverage() {
        for (int i : marks) {
            total = i + total;
        }
        System.out.println(total / marks.length);
    }


    public static void main(String[] args) {

        ArrayAverage ara = new ArrayAverage();
        ara.doAverage();

    }
}

