package Arrays;

import java.lang.reflect.Array;

public class ArrayMethods {

    int[] arr = {1,2,3,4,5,6,7,8,9,0};

    public void arrayMethods(){
        System.out.println(Array.get(arr,3));
    }


    public static void main(String[] args) {
        ArrayMethods arrMethods = new ArrayMethods();
        arrMethods.arrayMethods();


    }
}
