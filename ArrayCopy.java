public class ArrayCopy {

    int[] rollNumbers = new int[]{100, 101, 102, 103, 104};

    int newRollNumbers[] = new int[5];

    public void doCopy() {

        for (int i = 0; i < rollNumbers.length; i++) {

            newRollNumbers[i] = rollNumbers[i];

        }


        for (int k : newRollNumbers) {
            System.out.println(k);
        }

    }


    public static void main(String[] args) {

        ArrayCopy arc = new ArrayCopy();
        arc.doCopy();
    }
}
