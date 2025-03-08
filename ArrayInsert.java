public class ArrayInsert {

    int rollNumbers[] = new int[]{101, 102, 103, 104, 105, 106, 108, 0};
    int index_position = 6;
    int insertValue = 107;

    public void doInsert() {

        for (int i = rollNumbers.length - 1; i > index_position; i--) {
            rollNumbers[i] = rollNumbers[i - 1];
        }
        rollNumbers[6] = insertValue;
    }

    public void doTraverse() {
        for (int i = 0; i < rollNumbers.length; i++) {
            System.out.print(" " + rollNumbers[i]);
        }
    }

    public static void main(String[] args) {

        ArrayInsert ari = new ArrayInsert();
        ari.doInsert();
        System.out.println("Array after insertion :");
        ari.doTraverse();

    }
}
