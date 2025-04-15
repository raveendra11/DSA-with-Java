public class ArrayRightShift {

    int numbers[] = new int[]{1,2,3,4,5,6};

    public void doRightShift(){

        for(int i=numbers.length-1;i>0;i--){
            numbers[i]=numbers[i-1];
        }
        numbers[0]=6;

        for(int x: numbers){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {

        ArrayRightShift arsh = new ArrayRightShift();
        arsh.doRightShift();

    }

}
