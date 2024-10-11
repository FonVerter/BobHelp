package datetime;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Date;

public class datatest {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        System.out.println(dayOfWeek);

        int i = localDateTime.getDayOfWeek().getValue();
        System.out.println(i);

    }
}
