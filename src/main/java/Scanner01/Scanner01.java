package Scanner01;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //1.adım olarak bir scanner objesi olusturmamiz gerekmektedir
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen kullanıcı adinizi giriniz");
        String kullaniciAdi=input.next();
        System.out.println("kullanıcı adi : "+kullaniciAdi);


        //Ornek 1 : Kullanicidan yasini isteyip console’a yazdiriniz.
        //Example 1: Ask the user for their age and print it to the console.

        //2.adım olarak kullanıcıya bilgi vermek
        System.out.println("lutfen yasinizi giriniz");
        //3.adım olarak kullanıcının girdigi bilgiyi variable'a atamak
        byte age=input.nextByte();

        System.out.println("girilen yas : "+age);


    }
}