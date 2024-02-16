package day21_MultiDimentionalArray;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str = "heart";  // aehrt
        String str1 = "earth"; // aehrt

        str.split("");

      //  String[] a1 = str.split("") ;
       //String[] a2 = str1.split("") ;

char[] a1 = str.toCharArray();
char[] a2 = str1.toCharArray();


        Arrays.sort(a1);
        Arrays.sort(a2);

        boolean isAnagram = Arrays.equals(a1,a2);

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));


    }
}
