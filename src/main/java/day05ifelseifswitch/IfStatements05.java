package day05ifelseifswitch;

import java.util.Scanner;

public class IfStatements05
{
    public static void main(String[] args) {




/*Ornek 1: Kullanicidan yas degerini alan
ve yasin hangi evrede oldugunu asagidaki tabloya gore yazdiran kodu olusturunuz
0-4 (dahil) ==> bebek
5-12 (dahil)==> cocuk
13-20 (dahil) ==> genc
21-30 (dahil) ==> yetiskin
30 ustu ==> Tanimlanmamis
yazdiriniz*/
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int age= input.nextInt();

        if (age<0){
            System.out.println("lutfen gecerli bir yas giriniz");
        } else if (age<5) {//age<=4;
            System.out.println("Bebek");
        } else if (age<13) {
            System.out.println("Cocuk");
        } else if (age<21) {
            System.out.println("Genc");
        } else if (age<31) {
            System.out.println("Yetiskin");
        }else {
            System.out.println("tanimlanmamis yas");
        }


    }
}
