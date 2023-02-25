package src.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Humidity ss = new Humidity();
        System.out.println(ss.humidity());
        Date date = new Date();
        System.out.println(date.getMonth());
        System.out.println(EnumMonth.Month.December);
        System.out.println("Ведите дату полива - ");
        Scanner inputdate = new Scanner(System.in);
        String date2 = inputdate.next();
        Date datenow = new Date();
        String date1 = new SimpleDateFormat("dd-MM-yyyy").format(datenow);
        System.out.println(date2);
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date dateOne = null;
        Date dateTwo = null;
        try {
            dateOne = format.parse(date1);
            dateTwo = format.parse(date2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Количество дней между датами в миллисекундах
        long difference = dateOne.getTime() - dateTwo.getTime();
        // Перевод количества дней между датами из миллисекунд в дни
        int days =  (int)(difference / (24 * 60 * 60 * 1000)); // миллисекунды / (24ч * 60мин * 60сек * 1000мс)
        // Вывод разницы между датами в днях на экран
        System.out.println("Последняя дата полива " + days + " дн.");
    }
}
