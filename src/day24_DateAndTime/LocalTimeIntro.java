package day24_DateAndTime;

import java.time.LocalTime;

public class LocalTimeIntro {
    public static void main(String[] args) {

        LocalTime startTime =LocalTime.of(10,30);
        System.out.println(startTime);

        LocalTime rightNow = LocalTime.now();
        System.out.println(rightNow);

        System.out.println("================================");

        LocalTime time1 = LocalTime.of(23,45,34);
        System.out.println(time1);

     time1 = time1.plusHours(1);

        System.out.println(time1);

       time1 = time1.plusMinutes(45);

        System.out.println(time1);

        System.out.println("================================");


    }
}
