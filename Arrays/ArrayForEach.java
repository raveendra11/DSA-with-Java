package Arrays;

public class ArrayForEach {

    int rollNumbers[] = new int[]{1, 2, 3, 4, 5};

    public void withForEach() {
        for (int i : rollNumbers) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        ArrayForEach afe = new ArrayForEach();
        afe.withForEach();

    }

}
