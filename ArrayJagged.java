public class ArrayJagged {
    public static void main(String[] args) {
        int [][] rollNumbers = new int[][]{{1,2,3},{4,5,6,7},{8,9},{10}};

        for(int i =0;i<rollNumbers.length;i++){
            for(int j=0;j<rollNumbers[i].length;j++){
                System.out.println(rollNumbers[i][j]);
            }
        }

        for(int x[] : rollNumbers){
            for(int y : x ){
                System.out.println(y);
            }
        }

    }
}
