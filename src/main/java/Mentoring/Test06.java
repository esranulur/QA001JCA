package Mentoring;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {


//Verilen BMI degerleri için Vücut Kitle Indeksi (BMI) ile ilgili mesajları yazdırmak için kod yazınız.
//Geçersiz BMI degeri < 0
//Zayıf = <18.5
//Normal agırlık = 18.5–24.9
//Fazla kilolu = 25–29.9
//Obezite = 30 veya daha büyük BMI


        Scanner input=new Scanner(System.in);
        System.out.println("lutfen BMI degerini giriniz");
        double BMI = input.nextDouble();

        if (BMI<0){
            System.out.println("gecersiz  BMI degeri ");

        } else if (BMI<18.5) {
            System.out.println("zayif");

        } else if (BMI<=24.9) {
            System.out.println("normal agirlik");

        } else if (BMI<=29.9) {
            System.out.println("fazla kilolu");


        }else {
            System.out.println("obezite");

    }}}
