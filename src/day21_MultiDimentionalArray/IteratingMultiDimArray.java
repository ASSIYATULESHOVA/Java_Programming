package day21_MultiDimentionalArray;

import java.util.Arrays;

public class IteratingMultiDimArray {
    public static void main(String[] args) {

        // index         0   1   2    0    1   2   3  4      0   1
        int [][]  arr2D = {{10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100}};
        //index             0                1                 2

        for (int i = 0; i < arr2D.length; i++) { // i is index of one dim array
             int[] each1D = arr2D[i];
            System.out.println(Arrays.toString(each1D));

            for (int j = 0; j < each1D.length ; j++) { // j is index num of each elements

                int eachElement = each1D[j];
                System.out.println(eachElement);
            }
        }

        System.out.println("============================");

        for (int[] each1DArray:arr2D){
            System.out.println(Arrays.toString(each1DArray));

            for (int ignored : each1DArray) {
                System.out.println(ignored);
            }
        }


    }
}
