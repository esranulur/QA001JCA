package day34_Lambda;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Lambda03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int sayi= input.nextInt();
        int factorial=getFactorial(sayi);
        System.out.println(factorial);
    }
    //3)Size verilen sayinin faktoriyelini hesaplayan kodu yaziniz.
    public static int getFactorial(int sayi){
        //int sayi deger negatif olamaz cunku negatiflerin faktiyoli yoktur
        //int sayi degeri 0 ise 1 dondurmemiz gerekiyor
        if (sayi==0){
            return 1;
        } else if (sayi<0) {
            System.out.println("Negatif kullanılamaz cunku faktoriyeli yoktur!!!");
            return -1;
        }else {
            return IntStream.
                    rangeClosed(1,sayi).
                    reduce(Math::multiplyExact).
                    getAsInt();
        }

    }

}