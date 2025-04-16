package Arrays;

public class ArrayMissElementmtwo {

    int[] numbers = new int[]{3, 7, 4, 9, 12, 6, 1, 11, 2, 10};

    int[] numbers2 = new int[13];

    public void doFindMissing() {
        for (int i = 0; i < numbers.length; i++) {
            numbers2[numbers[i]]++;
        }
        for (int j = 1; j < numbers2.length; j++) {
            if (numbers2[j] == 0) {
                System.out.println(j);
            }

        }
    }

    public static void main(String[] args) {
        ArrayMissElementmtwo arme = new ArrayMissElementmtwo();
        arme.doFindMissing();
    }
}
