package day06ifelseifswitch;

import java.util.Scanner;

public class IfStatements04 {

    public static void main(String[] args) {

        // bir kisinin kan bagisinda bulunup bulunamayacigini control ediniz .
// yas:18 ve uzeri olmali
// kilo : 50 dan ust olmali


        Scanner input=new Scanner(System.in);

        System.out.println(" ");
        System.out.println("kilonuz 50 den fazla olmali ");



//1. adım kullanıcıdan bilgi almak(Scanner objesini olusturmak)
//2. adım kullanıcıya bilgi vermemiz gerekir
//3. adım kullanıcıdan aldıgımız bilgileri variable'a atamak
//4. adım kosul kontrolu yapmalıyız

        System.out.println("lutfen yasinizi giriniz");
        int age= input.nextInt();
        System.out.println("lutfen kilonuzu giriniz");
        double kilo=input.nextDouble();

        if (age<0){
            System.out.println("yas bilgisi negatif olamaz lutfen gercek yasinizi giriniz");
        } else if (age<18) {
            System.out.println("yasinizin kucuk olmasi nedeniyle kan bagisinda bulunamazsiniz");
        }else {

            if (kilo<0){
                System.out.println("kilo bilgisi negatif olamaz lutfen gecerli bir kilo bilgisi giriniz");
            } else if (kilo<50) {
                System.out.println("kilonuzun yetersiz olmasi nedeniyle kan bagisinda bulunamazsiniz");
            }else {
                System.out.println("evet kan verebilirsiniz lutfen assagida bulunan formu doldurunuz");
                System.out.println("...");
            }

        }





    }

}
