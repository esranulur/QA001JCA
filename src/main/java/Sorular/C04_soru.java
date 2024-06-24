package Sorular;

import java.util.Scanner;

public class C04_soru {

    public static void main(String[] args) {

        //Toplama, Çıkarma, Çarpma, Bölme ve kalan Hesaplama
//yapan basit bir Hesap Makinesi oluşturun://

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen islem yapmak istediginiz operatoru giriniz:\n+,*,-,/,%");//alican
        char operator=input.next().charAt(0);
        switch (operator){
            case '+':
                System.out.println("lutfen islem yapmak istediginiz sayilari giriniz");
                System.out.println("sayilarin toplami : "+(input.nextDouble()+input.nextDouble()));
                break;
            case '*':
                System.out.println("lutfen islem yapmak istediginiz sayilari giriniz");
                System.out.println("sayilarin carpimi : "+(input.nextDouble()*input.nextDouble()));
                break;
            case '-':
                System.out.println("lutfen islem yapmak istediginiz sayilari giriniz");
                System.out.println("sayilarin farki : "+(input.nextDouble()- input.nextDouble()));
                break;
            case '/':
                System.out.println("lutfen islem yapmak istediginiz sayilari giriniz");
                double sayi1=input.nextDouble();
                double sayi2=input.nextDouble();
                if (sayi2==0){
                    System.out.println("payda 0 olamaz");
                }else {
                    System.out.println("sayilarin bolumu : "+sayi1/sayi2);

                }
                break;
            case '%':
                System.out.println("lutfen islem yapmak istediginiz sayilari giriniz");
                System.out.println("sayilarin bolumunden kalan : "+input.nextDouble()%input.nextDouble());
                break;
            default:
                System.out.println("lutfen gecerli bir operator giriniz");

        }



    }

}
