package day34_Lambda;

import java.util.stream.IntStream;

public class Utils {
    /*Java'da "Utils" (fayda-araclar-utilities) class'i oluşturmanın temel mantığı,
 belirli bir konsept veya işlevsellikle ilgili yardımcı (helper) metotları bir araya toplamaktır.
 Bu class'lar genellikle static metotlardan oluşur ve doğrudan class adı üzerinden çağrılırlar.
 Buraya Java'da olmayan ama bizim surekli projemizde kullandigimiz bir islevi method olarak ekleriz
 ve onu cagirip kullaniriz. Amaca uygun yeni methodlar olusturabiliriz.*/
    /*
    Ornegin; D33lambda’daki class’larda /*Hep ekrana bir boslukla yazdirmak icin
forEach(t -> System.out.print(t+" “) kullandik. For each icini
method haline getirelim ve cagiralim
     */
    public static void printInTheSameLineWithSpace(Object obj){
        //String veya int yazdir diye sınırlamamak icin object yazdir
        System.out.printf("%15s",obj+"\n");
        //  System.out.print(obj + " ");
        //        //System.out.printf("%-15s  %3s",obj , "123\n");
    }
    //cift sayilari bulma isini utils classindan yapalim
    public static boolean isNumberEven(int num){
        return num%2==0;
    }
    }





