package Arrays;

import java.lang.*;

public class CopyArray {

    public static void main(String[] args) {
      // This program will use the System.arraycopy();

       double v[] = {1, 2, 3, 4, 5, 6};
       double newArr[] = copyArray(v);

       for(int i = 0; i < newArr.length; i++){
           System.out.println(newArr[i]);
       }

    }

    public static double[] copyArray(double[] v){
        double doubleArray[] = {7, 8, 9};
        System.arraycopy(v, 0, doubleArray, 0, 3);

        return doubleArray;
    }
}
