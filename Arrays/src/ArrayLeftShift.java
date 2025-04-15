public class ArrayLeftShift {

    int[] rollNumbers = new int[]{6,1,2,3,4,5};

    int temp = rollNumbers[0];

    public void doLeftShift(){

        for(int i=0;i< rollNumbers.length-1;i++){
            rollNumbers[i] = rollNumbers[i+1];
        }
        rollNumbers[rollNumbers.length-1]=temp;

        for(int x:rollNumbers){
            System.out.println(x);
        }

    }

    public static void main(String[] args) {

        ArrayLeftShift arls = new ArrayLeftShift();
        arls.doLeftShift();

    }
}
