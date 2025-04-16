package Arrays;

public class Arrays {

    public static void main(String[] args) {

        // Declare
        int[] rollNumber;

        // Initialize
        rollNumber = new int[5];

        rollNumber[0] = 101;

        // Declare and Initialize
        int[] rollNumbers = new int[5];

        rollNumbers[0] = 101;

        // Declare,Initialize, and Assign
        int[] rollNo = new int[]{101, 102, 103, 104, 105};

        // Declare,Initialize, and Assign
        int[] rollNum = {101, 102, 103, 104, 105};

        // Looping
        for(int i : rollNum){
            System.out.println(i);
        }
    }
}
