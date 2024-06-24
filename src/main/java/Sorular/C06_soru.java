package Sorular;

import java.util.Scanner;

public class C06_soru {

    /*
    Soru 5) Kullanicidan 100'den kucuk bir tamsayi isteyin.
     girilen sayidan baslayarak -50' kadar(istenen sayi dahil) 3'un kati olan sayilari yazdirin.
    */ {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen 100'den kucuk bir tamsayi giriniz");
        int sayi = input.nextInt();

        for (int i = sayi; i > -50; i--) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}