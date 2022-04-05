package day32_DateTime;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Timer;
import java.util.spi.LocaleServiceProvider;

public class C01_DateTime {
    public static void main(String[] args) {
        LocalDate trh = LocalDate.now();
        LocalDate trh2 = LocalDate.now();
        System.out.println(trh);
        System.out.println(trh2);

        LocalDate yas = LocalDate.of(1984, 11, 11);
        System.out.println(yas);

        System.out.println(LocalDate.from(yas));

        System.out.println(trh.getDayOfMonth());
        System.out.println(trh.getChronology());
        System.out.println(trh.toString());

        System.out.println(trh.plusMonths(23));
        System.out.println(trh.minusMonths(4));
        System.out.println(trh.minusMonths(4).minusDays(5));

        //Tarih dile göre degismez.
        System.out.println(LocalDate.now().isLeapYear()); //Artık yıl
        System.out.println(LocalDate.now(ZoneId.of("Turkey")));

        System.out.println(trh.isAfter(yas));
        System.out.println(trh.isBefore(yas));

        System.out.println(trh.compareTo(yas)); //38


    }
}
