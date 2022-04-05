package day32_DateTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println(time);

        int sayi = 0;
        for (int i = 0; i < 1000; i++) {
            System.out.println(LocalTime.now());
        }
        System.out.println(LocalTime.now());

        System.out.println(time.compareTo(LocalTime.now()));

        double nano1 = time.getNano();
        System.out.println(nano1);

        System.out.println(time.plusMinutes(10));

        System.out.println(LocalTime.now(ZoneId.of("Japan")));

    }
}
