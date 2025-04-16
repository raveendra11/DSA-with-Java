package Arrays;

public class ArrayAppend {

    public static void main(String[] args) {

        int rollNumbers[] = new int[7];
        int n = rollNumbers.length;
        rollNumbers[0]=10;
        rollNumbers[1]=20;
        rollNumbers[2]=30;
        rollNumbers[3]=40;
        rollNumbers[4]=50;
        rollNumbers[5]=60;
        rollNumbers[n-1]=70;


        for(int x : rollNumbers){
            System.out.println(x);
        }
    }
}
