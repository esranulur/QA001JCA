package day05ifelseifswitch;

import java.util.Scanner;

public class ifstatement04 {

    public static void main(String[] args) {



        /*Ornek 1: Kullanicidan gun sayisini aldiginizda gun ismini yazan kodu yaziniz
         */
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen kacinci gün oldugunu giriniz");
        double doubleNum= input.nextDouble();
        int num= (int)doubleNum;
        if (doubleNum!=num){
            System.out.println("lutfen tam sayi giriniz");
        }else {

            if (num<=0){
                System.out.println("gun sayilari 1'den kucuk olamaz");
            } else if (num==1) {
                System.out.println("Pazar");//sunday
            } else if (num==2) {
                System.out.println("Pazartesi");//monday
            } else if (num==3) {
                System.out.println("Salı");//tuesday
            } else if (num==4) {
                System.out.println("Carsamba");//wednesday
            } else if (num==5) {
                System.out.println("persembe");//thursday
            } else if (num==6) {
                System.out.println("Cuma");//friday
            } else if (num==7){
                System.out.println("Cumartesi");//saturday
            }else {
                System.out.println("Gun sayilari 7'den buyuk olamaz");
            }
        }
        //yukardaki sorudan bagimsiz ondalıklı sayi kontrol etmek icin

// double numDouble= input.nextDouble(); //5.7
// int num1=(int)numDouble;//type casting 5

// if (numDouble!=num1){
//     System.out.println("lutfen tam sayi giriniz");
// }else {
//     if (num1>0){
//         System.out.println("sayi pozitiftir");
//     }
// }
    }
}
