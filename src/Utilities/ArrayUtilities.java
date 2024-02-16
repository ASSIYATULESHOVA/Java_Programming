package Utilities;

import java.util.Arrays;

public class ArrayUtilities {

    public static int[] addElement(int[] array, int element) {
        int[] new_Array = Arrays.copyOf(array, array.length + 1);
        new_Array[new_Array.length - 1] = element;
        System.out.println(Arrays.toString(new_Array));
        return new_Array;
    }

    public static double[] addElement(double[] array, double element) {
        double[] new_Array = Arrays.copyOf(array, array.length + 1);
        new_Array[new_Array.length - 1] = element;
        System.out.println(Arrays.toString(new_Array));
        return new_Array;
    }


    public static String[] addElement(String[] array, String element) {
        String[] new_Array = Arrays.copyOf(array, array.length + 1);
        new_Array[new_Array.length - 1] = element;
        System.out.println(Arrays.toString(new_Array));
        return new_Array;
    }

    public static char[] addElement(char[] array, char element) {
        char[] new_Array = Arrays.copyOf(array, array.length + 1);
        new_Array[new_Array.length - 1] = element;
        System.out.println(Arrays.toString(new_Array));
        return new_Array;

    }


    public static boolean contains(int[]array, int element){

        for (int each : array){
            if(each == element){
                return true;
            }
            }
        return false;
    }

    public static boolean contains(double[]array, double element){

        for (double each : array){
            if(each == element){
                return true;
            }
        }
        return false;
    }
    public static boolean contains(char[]array, char element){

        for (char each : array){
            if(each == element){
                return true;
            }
        }
        return false;
    }

    public static boolean contains(String[] array, String element){

        for (String each : array){
            if(each.equals(element)){
                return true;
            }
        }
        return false;
    }
    /*
    public static int[] remove(int[] array, int index){

    }


    public static int[] removeDup(int[] array, int index){

    }

    */

}
































