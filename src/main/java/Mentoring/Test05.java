package Mentoring;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {


      /*
Asagıdaki seçenekler dogrultusunda gereken kodu yazınız.
    a) Aralık, Ocak, Subat için "Kıs"
    b) Mart, Nisan, Mayıs için "Ilkbahar"
    c) Haziran, Temmuz, Agustos için "Yaz"
    d) Eylül, Ekim, Kasım için "Sonbahar"
    e) Digerleri için "Geçersiz ay adı"
 */


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir ay ismi giriniz");
        String ay = input.next();

        if (ay.equalsIgnoreCase("aralik") || ay.equalsIgnoreCase("ocak") || ay.equalsIgnoreCase("Subat")) {
            System.out.println("kis");
        } else if (ay.equalsIgnoreCase("mart") || ay.equalsIgnoreCase("nisan") || ay.equalsIgnoreCase("mayis")) {
            System.out.println("ilkbahar");
        } else if (ay.equalsIgnoreCase("haziran") || ay.equalsIgnoreCase("temmuz") || ay.equalsIgnoreCase("agustos")) {
            System.out.println("yaz");
        } else if (ay.equalsIgnoreCase("eylul") || ay.equalsIgnoreCase("ekim") || ay.equalsIgnoreCase("kasim")) {
            System.out.println("sonbahar");
        } else {
            System.out.println("gecersiz ay adi");
        }

        ay=ay.toLowerCase();
        switch (ay) {
            case "aralik", "ocak", "subat":
                System.out.println("kis");
                break;
            case "mart", "nisan", "mayis":
                System.out.println("ilkbahar");
                break;

            case "haziran", "temmuz", "agustos":
                System.out.println("yaz");
                break;
            case "eylul", "ekim", "kasim":
                System.out.println("sonbahar");
                break;

            default:
                System.out.println("gecersiz ay adi");
                break;


        }
    }
}
