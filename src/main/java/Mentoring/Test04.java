package Mentoring;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Test04 {
    public static void main(String[] args) {

         /*
odev!!!
    soru 3)
    bize bugunun tarihini ve su anki saati dondurun
    bize 3 ay 100 saat sonraki tarih ve saati dondurun
    bize 100 gun once 100 saat sonraki tarihi dondurun
    bize 3 yil 5 ay 10 gün 1000 saat sonraki tarihin haftanin hangi günü oldugunu dondurun
    bize sadece bugunun tarihi dondurun
     //LocalDateTime kullanarak yapın tum hepsini
     */

        LocalDateTime simdi =LocalDateTime.now();
        System.out.println(simdi);
        System.out.println( simdi.plusMonths(3).plusHours(100));

        System.out.println(simdi.minusDays(100).plusHours(100));
        System.out.println(simdi.plusYears(3).plusMonths(5).plusDays(10).plusHours(1000).getDayOfWeek());
        System.out.println(simdi.toLocalDate());

        

    }}