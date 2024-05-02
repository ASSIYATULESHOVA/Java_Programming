package day32_finalKeyword;

import java.time.LocalDate;

class Student{
    public void language(){
        System.out.println("Java Programming");
    }
}

public final class FinalKeyWord extends Student{

    public FinalKeyWord(){  // can not apply final key word to constructor
        System.out.println();
    }

    /*public  final void language(){
        System.out.println("Python Programming");
    }
*/
    public static void main(String[] args) {
       final char gender = 'M';
        System.out.println(gender);
     //   gender = 'F'; can not use it after final keyword
        System.out.println(gender);

        System.out.println("================================");

        final LocalDate dateOfBirth = LocalDate.now();;
        System.out.println(dateOfBirth);

        System.out.println("================================");


        new Student().language(); //Java
        new FinalKeyWord().language();


        System.out.println("================================");

    final String name = "James";

       /*
       name = null;
        name = "Daniel";
      */
        System.out.println(name); // James

    }
}
