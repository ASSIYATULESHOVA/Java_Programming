package day21_MultiDimentionalArray;

import java.util.Arrays;

public class TrimExtraSpace {
    public static void main(String[] args) {

        String str1 = "    Hello      world     I    love   Java   .   ";

      // str1 = str1.trim();

       // System.out.println(str1);

        String[] word = str1.split(" ");
        System.out.println(Arrays.toString(word));

        str1 = "";

      for (String each :word){
          if(!each.isEmpty()){
              str1+=each+" ";
          }
      }
        System.out.println(str1);


       String str = "   I   love   my   job  .";

       str = str.trim();

       String [] words = str.split(" ");

        System.out.println(Arrays.toString(words));

        str = "";

        for (String eachSp : words) {
            if(!eachSp.isEmpty()){
                str+= eachSp+" ";
            }

        }

        System.out.println(str);



    }
}
