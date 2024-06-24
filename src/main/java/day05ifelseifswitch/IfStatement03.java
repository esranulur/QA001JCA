package day05ifelseifswitch;

import java.util.Scanner;

public class IfStatement03 {

    public static void main(String[] args) {

        // int sayi=7;
// if (sayi>0){
//     System.out.println("sayi pozitiftir");
// }else if (sayi<0){
//     System.out.println("sayi negatiftir");
// }else {
//     System.out.println("sayi 0'dir(notr'dur)");
//
//
//
// }


        //Ornek 1:Kullanicidan alinan bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");

        if (input.hasNextInt()){//eger girilen deger int ise bu kontrolu yapsın
            int sayi=input.nextInt();
            if (sayi>0){
                System.out.println("sayi pozitiftir");
            }else if (sayi<0){
                System.out.println("sayi negatiftir");
            }else {
                System.out.println("sayi 0'dir(notr)");
            }
        }else {
            System.out.println("lütfen gecerli bir deger giriniz");
        }




    }


}
