package day04increment_decrement_if;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
//Ornek 1: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= input.nextInt();

        if (sayi%2==0){
            System.out.println("cift sayi");
        }else {
            System.out.println("tek sayi");
        }

        if (sayi%2==0){
            System.out.println("sayi cifttir");
        }
        if (sayi%2!=0){
            System.out.println("sayi tektir");
        }
    }
}