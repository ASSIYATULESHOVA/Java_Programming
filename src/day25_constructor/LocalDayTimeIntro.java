package day25_constructor;
import java.time.LocalDateTime;
public class LocalDayTimeIntro {
    public static void main(String[] args) {

        LocalDateTime starts = LocalDateTime.now();
        System.out.println(starts);

     LocalDateTime ends =   LocalDateTime.of(2023,5,28,11,0);
        System.out.println(ends);

        System.out.println(starts.getDayOfWeek());
        System.out.println(starts.getHour());




    }
}
