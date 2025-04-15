public class ArrayMatrixAddition {

    int[][] marksMath = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    int[][] marksScience = new int[][]{{3, 2, 1}, {6, 5, 4}, {9, 8, 7}};


    public void doMatrixAddition() {
        for (int i = 0; i < marksScience.length; i++) {
            for (int j = 0; j < marksScience[i].length; j++) {
                int addition = marksMath[i][j] + marksScience[i][j];
                System.out.print(addition + "   ");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {

        ArrayMatrixAddition arma = new ArrayMatrixAddition();
        arma.doMatrixAddition();

    }
}
