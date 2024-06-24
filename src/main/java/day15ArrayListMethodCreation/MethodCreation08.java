package day15ArrayListMethodCreation;

import java.sql.SQLOutput;

public class MethodCreation08 {


    public static void main(String[] args) {
        String renk = "Kırmızı";
        String marka = "Brother";
        String model = "J105";

        String str = "Java candir gerisi heyecan.";
        yazdirma(str);
        tarama(str);
    }

    public static String yazdirma(String neYazdirilcak) {
        System.out.println("Alınan bilgi yaziciya yonlendiliyor...");
        System.out.println("Alınan bilgi A4 kagına yazdiriliyor...");
        System.out.println("Alınan bilgi A4 kagına yazdilirdi  ...");
        System.out.println(neYazdirilcak);
        return neYazdirilcak;
    }
    public static String tarama(String neTaranacak){
        System.out.println("Taramak istediginiz bilgiyi yaziciya yukleyin");
        System.out.println("Bilgi taraniyor...");
        System.out.println("Bilgi tarandi...");
        System.out.println("Devam etmek icin yeni bilgiyi yaziciya yukleyin");
        System.out.println("Bilgi taraniyor...");
        System.out.println("Bilgi tarandi...");
        System.out.println(neTaranacak);
        return neTaranacak;

    }

}