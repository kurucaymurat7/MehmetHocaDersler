package day32_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihsaat = LocalDateTime.now();
        System.out.println(tarihsaat);

        System.out.println(tarihsaat.plusYears(3).plusDays(5));


    }
}
