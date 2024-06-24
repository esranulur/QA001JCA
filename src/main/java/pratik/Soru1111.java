package pratik;

import java.util.Scanner;

public class Soru1111 {
    public static void main(String[] args) {
/*Ornek 1:
Kullanıcıdan;
    i)Adini ve Soyadini
    ii)Yaşını
    iii)Boyunu
    iv)Kilosunu
    v)Medeni durumunu girmesini isteyin.
Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın

 */


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen ad soyad ");

        String name = input.nextLine();
        System.out.println("yas ");
        int yas = input.nextInt();
        System.out.println("boy");
        double boy = input.nextDouble();
        System.out.println("kilo");
        double kilo= input.nextDouble();
        System.out.println("medeni durum");
        String medeni= input.next();
        System.out.println("name = " + name);

        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("kilo = " + kilo);
        System.out.println("medeni = " + medeni);

        System.out.println("yas:"+yas+"\nboy:"+boy);

    }
}