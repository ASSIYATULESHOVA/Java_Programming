package day22_arrayList;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "20";

        System.out.println(str +1); //201
        // Integer num = Integer.parseInt(str);
         int num = Integer.parseInt(str); // primitive int
        System.out.println(num+ 1);     // 21


      Integer num2= Integer.valueOf(str);

        System.out.println(num2); //20

        String str1 = "20.5";

        Double d1 = Double.parseDouble(str1);
        System.out.println(str1);
       Double d2 = Double.valueOf(d1);

        System.out.println(d2);


        System.out.println("============================================");


   String x = "true";
  boolean r1 = Boolean.parseBoolean(x);
  Boolean r2 = Boolean.valueOf(x);
        System.out.println(r2);

        System.out.println("---------------------------------------------------");

       char ch = '$';

      boolean isDigit = Character.isDigit(ch);

    boolean isLetter =  Character.isLetter(ch);

    boolean isLowerCaseLetter = Character.isLowerCase(ch);
    boolean isUpperCaseLetter = Character.isUpperCase(ch);
    boolean isSpecialCharacter = Character.isLetterOrDigit(ch);
        System.out.println("isDigit = " + isDigit);
        System.out.println("isLetter = " + isLetter);
        System.out.println("isLowerCaseLetter = " + isLowerCaseLetter);
        System.out.println("isUpperCaseLetter = " + isUpperCaseLetter);
        System.out.println("isSpecialCharacter = " + isSpecialCharacter);


        System.out.println("==================================================");


        String string = "a1b2c3d4e5";

        int sum = 0;

        string.toCharArray();

        for (char each : string.toCharArray()){
            if(Character.isDigit(each)){
               sum+= Integer.parseInt(""+each);

            }
        }
        System.out.println("sum = " + sum);















    }
}
