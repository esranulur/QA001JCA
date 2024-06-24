package Proje.LoginPageApp;

import java.util.Scanner;

public class LoginPageApp {
/*

    Project: Bir siteye üye olma ve giriş yapma sayfası tasarlayınız.

    menü: kullanıcıya işlem seçimi için menü gösterilir.//switch+do while

    üye olma(register): kullanıcıdan ad-soyad, email ve şifre bilgileri alınız.
    email ve şifre birer listede tutulur.
    aynı email kabul edilmez.//unique

    giriş(login): email ve şifre girilir.
    email bulunamazsa kayıtlı değil, üye olun uyarısı verilir.
    email ile aynı indekste kayıtlı şifre doğrulanırsa siteye giriş yapılır.

    email validation: boşluk içermemeli
    : @ içermeli
                     : gmail.com,hotmail.com veya yahoo.com ile bitmeli.
                             : mailin kullanıcı adı kısmında(@ den önce) sadece büyük-küçük harf,rakam yada -._ sembolleri olabilir.

    password validation: boşluk içermemeli
    : en az 6 karakter olmalı
    : en az bir tane küçük harf içermeli
    : en az bir tane büyük harf içermeli
    : en az bir tane rakam içermeli
    : en az bir tane sembol içermeli


           //ODEV!!!
        //boolean isValid;
        //if (!email.contains("@")){
        //    System.out.println("email @ sembolu icermelidir");
        //    isValid=false;
        //}


         /*   if (email.contains(" ")) {
                System.out.println("Email bosluk karakteri icermemeli!");
                return false;
            }

            if (!email.contains("@")) {
                System.out.println("Email '@' karakteri icermeli!");
                return false;
            }


            if (!(email.endsWith("gmail.com") || email.endsWith("hotmail.com") || email.endsWith("yahoo.com"))) {
                System.out.println("Email 'gmail.com', 'hotmail.com' veya 'yahoo.com' ile bitmeli!");
                return false;
            }

            String username = email.substring(0, email.indexOf("@"));
            if (!username.matches("[a-zA-Z0-9._-]+")) {
                System.out.println("                             : mailin kullanıcı adı kısmında(@ den önce) sadece büyük-küçük harf,rakam yada -._ sembolleri olabilir.\n");
                return false;
            }

            return true;

                     // Geçerli domain kontrolü
        String[] validDomains = { "gmail.com", "hotmail.com", "yahoo.com" };
        boolean validDomain = false;
        for (String domain : validDomains) {
            if (email.endsWith(domain)) {
                validDomain = true;
                break;
            }
        }
        if (!validDomain) {
            System.out.println("Email gmail.com, hotmail.com veya yahoo.com ile bitmelidir.");
            isValid = false;
        }         boolean isValid = true;
            String username=email;

            if (email.contains(" ")) {
                System.out.println("Email bosluk icermemelidir.");
                isValid = false;
            }


            if (!email.contains("@")) {
                System.out.println("Email @ sembolü icermelidir.");
                isValid = false;
            }else {
                System.out.println("ffg");
            }



            if  (!(email.endsWith("gmail.com") || email.endsWith("hotmail.com") || email.endsWith("yahoo.com")))  {
                System.out.println("Email gmail.com, hotmail.com veya yahoo.com ile bitmelidir.");
                isValid = false;
            }

            String username = email.substring(0, email.indexOf('@'));
            if (!username.matches("[a-zA-Z0-9._-]+")) {
                System.out.println("  Email kullanıcı adı kısmında sadece büyük-küçük harf, rakam veya -._ sembolleri olabilir.");
                isValid = false;
            }

            return isValid;/*



 */



public static void main(String[] args) {
    //kullanici  olusturdugumuz bir classta ozellikleri yazalim
    //kullanciyla ilgiili  islem yapabilmek icin UserService olusturalim

//UserService userService=new UserService();
//userService.register();

    start();

}
public static void start() {
    Scanner input = new Scanner(System.in);
//user service'ten bir service objesi olusturalım
    UserService service = new UserService();
    int select;

    do {
        System.out.println("******TECHPROEDUCATION******");
        System.out.println("1-Üye Ol");
        System.out.println("2-Giriş Yap");
        System.out.println("0-Çıkış");
        select = input.nextInt();
        switch (select) {
            case 1:
                service.register();
                break;
            case 2:
                service.login();
                break;
            case 0:
                System.out.println("iyi günler dileriz... <3");
                break;
            default:
                System.out.println("Hatali giriş yaptınız tekrar deneyiniz");
                break;
        }

    } while (select != 0);

}}