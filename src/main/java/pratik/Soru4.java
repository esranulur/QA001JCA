package pratik;

import java.util.Scanner;

public class Soru4 {

    public static void main(String[] args) {
        //Ornek 1: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int sayi= input.nextInt();

        if (sayi%2==0)
            System.out.println("cift sayi");
        else
            System.out.println("tek sayi");

    }
}
