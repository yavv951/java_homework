package src.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Date datenow = new Date();
        System.out.println("Текущая дата " + datenow.toInstant() + " Ведите дату полива в формате dd-MM-yyyy");
        Scanner inputdate = new Scanner(System.in);
        String date2 = inputdate.next();
        String date1 = new SimpleDateFormat("dd-MM-yyyy").format(datenow);
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
        int days = (int) (difference / (24 * 60 * 60 * 1000)); // миллисекунды / (24ч * 60мин * 60сек * 1000мс)
        // Вывод разницы между датами в днях на экран
        System.out.println("Последняя дата полива " + days + " дн.");
        System.out.println("Сейчас " + datenow.getMonth() + " Месяц ");
        int month = datenow.getMonth();
        Humidity hum = new Humidity();
        //Дата полива весной или осенью
        Date DateWatering1 = format.parse(date2);
        DateWatering1 = DateUntil.addDays(DateWatering1, 7);
        //Дата полива зимой
        Date DateWatering2 = format.parse(date2);
        DateWatering2 = DateUntil.addDays(DateWatering2, 30);
        if (month == 5 || month == 6 || month == 7 && hum.humidity() < 30) {
            System.out.println("Сейчас ЛЕТО " + datenow.toInstant() + " посмотрим какая влажность в комнате");
            System.out.println("Влажность в  комнате " + hum.humidity());
            if (hum.humidity() > 30){
                System.out.println("Поливать не нужно, проверьте влажность завтра " + datenow.toInstant());
            }
            else{
                System.out.println("Нужно полить кактус" + datenow.toInstant());
            }
        }
        if (month == 2 || month == 3 || month == 4 || month == 8 || month == 9 || month == 10) {
            System.out.println("Сейчас ОСЕНЬ или ВЕСНА, поливать кактус нужно через каждые 7 дней ");
            if (days > 7){
                System.out.println("Прошло более 7 дней, нужно полить кактус " + datenow.toInstant());
            }
            else{
                System.out.println("Нужно полить кактус " + DateWatering1);
            }
        }
        else{
            System.out.println("Сейчас ЗИМА, кактус поливать нужно раз в месяц ");
            if (days > 30){
                System.out.println("Прошло более 30 дней, нужно полить кактус " + datenow.toInstant());
        }
            else {
                System.out.println("Нужно полить кактус " + DateWatering2);
            }
    }
}
}
