package day32_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihsaat = LocalDateTime.now();
        System.out.println(tarihsaat);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yy");
        System.out.println(LocalDateTime.now().format(formatter));
        System.out.println(formatter.format(tarihsaat));

        DateTimeFormatter formatterSaat = DateTimeFormatter.ofPattern("HH:mm:ss a");
        System.out.println(formatterSaat.format(tarihsaat));



    }
}
