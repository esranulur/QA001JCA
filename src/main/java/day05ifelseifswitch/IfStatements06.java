package day05ifelseifswitch;

import java.util.Scanner;

public class IfStatements06 {

    public static void main(String[] args) {

        /*Ornek 1: Kullanicinin vermis oldugu gün isimlerine bakarak Hafta Sonu veya Hafta ici olduguna karar veren kodu yaziniz.
	Pazartesi ==> Hafta ici      Cumartesi ==> Hafta sonu*/


        Scanner input=new Scanner(System.in);
        System.out.println("lutfen gun ismini giriniz");

        String gunIsmi= input.next();
        //== gibi dusunebiliriz fakat stringlerde equals kullanılıyor
        //boolean deger true veya false donduren bir variable
        boolean haftaIciMi=gunIsmi.equalsIgnoreCase("Pazartesi")
                ||gunIsmi.equalsIgnoreCase("Salı")
                ||gunIsmi.equalsIgnoreCase("Carsamba")
                ||gunIsmi.equalsIgnoreCase("Perşembe")
                ||gunIsmi.equalsIgnoreCase("Cuma");

        boolean hatfaSonuMu=gunIsmi.equalsIgnoreCase("Cumartesi")
                ||gunIsmi.equalsIgnoreCase("Pazar");

        if (haftaIciMi){
            System.out.println("Hafta içi");
        } else if (hatfaSonuMu) {
            System.out.println("Hafta sonu");
        }else {
            System.out.println("gecerli bir gun ismi giriniz");
        }



    }
}
