package Arrays;

public class ArraySortInsert {

    int numbers[] = new int[]{4, 8, 13, 16, 20, 25, 28, 33, 0, 0};

    int insert = 18;
    int position = 0;

    public void doSortInsert() {

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > insert) {
                position = i;
                System.out.println("Position is " + position);
                break;

            }

        }
        for (int j = numbers.length - 1; j > position; j--) {

            numbers[j] = numbers[j - 1];

        }

        numbers[position] = 18;

        for (int x : numbers) {
            System.out.println(x);
        }

    }

    public static void main(String[] args) {

        ArraySortInsert arsi = new ArraySortInsert();
        arsi.doSortInsert();

    }
}
