package Arrays;

public class ArrayReverseTraversal {
    int marks[] = new int[]{95, 68, 35, 43, 25, 65};

    public void doReverse() {

        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }

    }

    public static void main(String[] args) {

        ArrayReverseTraversal art = new ArrayReverseTraversal();
        art.doReverse();

    }
}
