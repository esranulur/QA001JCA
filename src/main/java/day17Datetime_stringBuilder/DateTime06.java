package day17Datetime_stringBuilder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTime06 {
    public static void main(String[] args) {

//ornek 4: Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?
//ZoneId, zaman dilimi veya coğrafi bölge bilgisini temsil eder ve
// tarih/saat işlemlerinde bu bilginin kullanılmasını sağlar.


//ornek 4: Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?
//ZoneId, zaman dilimi veya coğrafi bölge bilgisini temsil eder ve
// tarih/saat işlemlerinde bu bilginin kullanılmasını sağlar.

//Tokyo'da ayin kaci?
        LocalDate dateInTokyo=LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

//Amsterdam'da Saat kaç?
        LocalTime timeInAmsterdam=LocalTime.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(timeInAmsterdam);

//Istanbul'da saat kaç?
        LocalTime timeInIstabul =LocalTime.now(ZoneId.of("Asia/Istanbul"));
        System.out.println(timeInIstabul);


    }}
