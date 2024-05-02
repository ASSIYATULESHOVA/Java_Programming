package day24_DateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateIntro {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate birthDay = LocalDate.of(1995,10,9);
        System.out.println(birthDay);

        System.out.println("=======================================");

        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getMonthValue());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfMonth());
        System.out.println(birthDay.getDayOfWeek());
        System.out.println(today.getDayOfYear());

        System.out.println("=======================================");


         today =   today.plusYears(1);

        System.out.println(today);
        System.out.println("=======================================");

        LocalDate gradDay = LocalDate.of(2025,6,4);
      gradDay =  gradDay.plusYears(2);

        System.out.println(gradDay);

      gradDay =  gradDay.plusMonths(7);

        System.out.println(gradDay);
     gradDay = gradDay.plusWeeks(7);
        System.out.println();

       gradDay = gradDay.plusDays(100);
        System.out.println(gradDay);

        System.out.println("=======================================");

     LocalDate yourBirthDay = LocalDate.of(2001,12,25);

    LocalDate yourSisterBirthDay =yourBirthDay.minusYears(6).minusMonths(3);
        System.out.println(yourBirthDay);
        System.out.println(yourSisterBirthDay);

        System.out.println("=======================================");

        LocalDate birthDay1 = LocalDate.of(1996,7,7);
        LocalDate birthDat2 = LocalDate.of(1995,6,7);

        boolean r1 = birthDay1.equals(birthDat2);
        System.out.println(r1);

        System.out.println("=======================================");

LocalDate grad_date = LocalDate.of(2024,7,30);

        System.out.println(grad_date.isBefore(LocalDate.of(2023,12,23)));
        System.out.println(grad_date.isAfter(LocalDate.of(2023,12,23)));


        System.out.println("==================================================");

        System.out.println(LocalDate.of(2024,12,20).isLeapYear());







    }
}
