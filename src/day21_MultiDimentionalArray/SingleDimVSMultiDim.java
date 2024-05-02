package day21_MultiDimentionalArray;

import java.util.Arrays;

public class SingleDimVSMultiDim {
    public static void main(String[] args) {

        int[] arr = new int[10];
        System.out.println(Arrays.toString(arr)); // 00 00 00 00 00

        int [][] arr2D = new int [5][];

        arr2D[0] = arr;
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(Arrays.toString(arr2D));


    }
}
