package Sorular;

import java.util.Scanner;

public class C02_soru {
    public static void main(String[] args) {


        //kullanicidan bir cumle isteyiniz ve cumlenin
//bas(ilk) harfini buyultun eger noktalama isareti yoksa noktalama isareti ekleyin
        //
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");//java bugun cok guzel geciyor//JAVA BUGUN COK GUZEL GECİYOR
        String cumle = input.nextLine();
        cumle = cumle.toUpperCase().charAt(0) + cumle.substring(1);

        if (cumle.endsWith(".")) {
            System.out.println(cumle);
        }
        if (!cumle.endsWith(".")) {
            System.out.println(cumle + ".");
        }
    }}