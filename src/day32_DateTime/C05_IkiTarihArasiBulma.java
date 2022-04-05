package day32_DateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_IkiTarihArasiBulma {


    public static void main(String[] args) {
        LocalDate bugun = LocalDate.now();
        LocalDate dogumGunu = LocalDate.of(1984, 11, 11);

        System.out.println(Period.between(bugun,dogumGunu));

        System.out.println(Period.between(dogumGunu,bugun).getYears());

        int year = 2010;
        int month = 11;
        int day = 11;

        LocalDate tarih = LocalDate.of(year, month, day);
        System.out.println(tarih);

    }
}
