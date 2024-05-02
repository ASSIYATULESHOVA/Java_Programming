package day21_MultiDimentionalArray;

import java.util.Arrays;

public class FourDimArray {
    public static void main(String[] args) {

        int [][][] arr3D1 = {{ {1,2}, {3,4,5}}, {{6,7,8,9}, {10,11,12}}};
        int[][][] arr3D2 = {{ {1,2,3}, {6,7,8,9}}, {{10,11}, {12,13,14}}};
        int [][][] arr3D3 = {{ {1,2,3}, {4,5,6,7,8}}, {{15,16,17,18}}};

        int [][][][] arr4D = { arr3D1, arr3D2, arr3D3};

        System.out.println(Arrays.deepToString(arr4D));

        for (int[][][] each3D : arr4D) {
            for (int[][] each2D : each3D) {
                for (int[] each1D : each2D) {
                    for (int eachElement : each1D) {
                        System.out.println(eachElement);
                    }
                }
            }
        }

    }
}
