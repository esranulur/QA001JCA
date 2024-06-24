package day06ifelseifswitch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {



 /*Ornek 1: Ay numarasini soyleyince,
        numarasi verilen ay'dan baslayip 12.aya kadar tum aylarin isimlerini yazdiran kodu yaziniz.
        8 ==> Agustos - Eylul - Ekim - Kasim - Aralik
        */
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen ay numarasini giriniz");
        byte ayNo= input.nextByte();

        //boolean float double long bu data type'lari switch icine giremeyiz

        switch (ayNo){//String int byte short char bu data turlerini girebiliriz
            case 1:
                System.out.println("ocak");
            case 2:
                System.out.println("subat");
            case 3:
                System.out.println("mart");
            case 4:
                System.out.println("nisan");
            case 5:
                System.out.println("mayis");
            case 6:
                System.out.println("haziran");
            case 7:
                System.out.println("temmuz");
            case 8:
                System.out.println("agustos");
            case 9:
                System.out.println("eylul");
            case 10:
                System.out.println("ekim");
            case 11:
                System.out.println("kasim");
            case 12:
                System.out.println("aralik");
                break;//
            default:
                System.out.println("gecerli bir ay numarasi giriniz");



        }


    }
}
