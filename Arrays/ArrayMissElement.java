package Arrays;

public class ArrayMissElement {

    int[] numbers = new int[]{6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17};

    int l = 6;

    int sum = 0;

    int index;

    public void doFind() {

        for (int i = 0; i < numbers.length; i++) {

            sum = numbers[i] - i;

            if (sum != l) {
                index = i;
                break;
            }
        }
        System.out.println(index + l);
    }

    public static void main(String[] args) {
        ArrayMissElement arme = new ArrayMissElement();
        arme.doFind();
    }
}
