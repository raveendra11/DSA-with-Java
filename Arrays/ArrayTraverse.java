package Arrays;

public class ArrayTraverse {
    int rollNumbers[] = new int[]{101, 102, 103, 104, 105};

    public void doTraverse() {

        for (int i = 0; i < rollNumbers.length; i++) {

            System.out.println(rollNumbers[i]);

        }

        for (int x : rollNumbers) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {

        ArrayTraverse art = new ArrayTraverse();
        art.doTraverse();
    }
}
