package pratik;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        //Ornek 1:Kullanicidan alinan bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz

        Scanner input=new Scanner(System.in);
        System.out.println("sayi giriniz");

        int sayi= input.nextInt();

        if (sayi>0)
            System.out.println("sayi pozitiftir");
       else if (sayi==0)
            System.out.println("sayi notrdir");
        else
            System.out.println("sayi negatiftir");


    }}
