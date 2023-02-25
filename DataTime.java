import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class DataTime {
    public static void main(String[] args) {

        Instant now = Instant.now();
        System.out.println(now);
        LocalDate start = LocalDate.of(2222,2,2);
        LocalDate today = LocalDate.now();
        System.out.println(start);
        System.out.println(today);
        System.out.println(today.minusDays(100));

    }

}
