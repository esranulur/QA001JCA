package Scanner01;

import java.util.Scanner;

public class Scanner04

{public static void main (String[] args ) {

//Ornek 4: Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
//i)Alanini hesaplayiniz ==> Kisa kenar * Uzun kenar
//ii)Cevresini hesaplayiniz ==> 2*Kisa Kenar + 2*Uzun Kenar


    //1. adım Scanner objemizi olusturalim
    Scanner input=new Scanner(System.in);
//2. adım kullanıcıya bilgi verelim
    System.out.println("lutfen dikdortgenin kısa kenarini giriniz");
//3. adım kullanıcıdan aldıgımız bilgileri variable'a atama islemi yapıcaz
    double shortSide= input.nextDouble();

    System.out.println("lutfen dikdortgenin uzun kenarini giriniz");
    double longSide= input.nextDouble();

    System.out.println("Alan : "+shortSide*longSide);


    System.out.println("Cevresi : "+(shortSide*2+longSide*2));



}}