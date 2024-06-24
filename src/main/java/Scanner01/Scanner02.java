package Scanner01;


import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
    /*
Ornek 1:
Kullanıcıdan;
i)Adini ve Soyadini ii)Yaşını
iii)Boyunu
iv)Kilosunu
v)Medeni durumunu girmesini isteyin.
Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın
Example 1:
From the user;
i) Name and Surname ii) Age
iii)Height
iv) Weight
v) Ask him to enter his marital status.
Then print them on separate lines in the console with a label*/

//1.adım olarak Scanner objesini olusturalım
        Scanner input=new Scanner(System.in);
//2.adım olarak kullanıcıya bilgi vermemiz gerekmektedir
        System.out.println("lutfen adinizi ve soyadınızı giriniz");
//3.adım olarak kullanıcıdan aldıgımız bilgiyi variable'a atama islemi yapıcaz
        String fullName= input.nextLine();
        System.out.println("fullName = " + fullName);


System.out.println("lütfen yasinizi giriniz");
byte  age = input.nextByte();

System.out.println("lutfen boyunuzu giriniz");
long height = input.nextLong();

System.out.println("lutfen kilonuzu giriniz" );
 short weight= input.nextShort();

        System.out.println("Lutfen medeni durumunuzu giriniz :");
        String maritalStatus = input.next();

        System.out.println("fullName = " + fullName +
                "age = " + age +
                "height = " + height +
                "weight = " + weight +
                "maritalStatus = " + maritalStatus);




} }
