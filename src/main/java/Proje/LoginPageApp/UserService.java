package Proje.LoginPageApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {
    public static Scanner input=new Scanner(System.in);
    List<String>emails=new ArrayList<>();
    List<String>passwords=new ArrayList<>();
    //3- ad soyad,email,sifre bilgilerini alıp kayıt edelim
    //uye ol methodu olusturduk
    public void register() {
        System.out.println("lutfen ad-soyad bilgisini giriniz");
        String name = input.nextLine();
        //4-email gecersiz ise tekrar tekrar girmeli
        String email;
        boolean isValid;
        do {
            System.out.println("lutfen email adresinizi giriniz");
            email = input.nextLine();
            isValid = validateEmail(email);

            if (emails.contains(email)) {
                System.out.println("Bu email zaten kayıtlı lutfen baska bir email adresi ile tekrar deneyiniz");
                isValid = false;
            }
        } while (!isValid);
        //5- password gecersiz ise tekrar tekrar girmeli
        String password;
        boolean isValidPassword;
        do {
            System.out.println("Lutfen password'unuzu giriniz");
            password = input.nextLine();
            isValidPassword = validatePassword(password);
        } while (!isValidPassword);


        //6-user olusturalim
        User user = new User(name, email, password);
        emails.add(user.getEmail());
        passwords.add(user.getPassword());
        System.out.println("Teprikler,kayit islemi basariyla gerceklesmistir");
        System.out.println("Email ve sifreniz ile sisteme giris yapabilirsiniz");

    }
    public void login(){
        System.out.println("Lutfen giris yapmak icin email adresinizi giriniz");
        String email=input.nextLine();
        //girilen email listede var mi?
        boolean isExistEmail=emails.contains(email);
        if (isExistEmail){
            //kullanicinin kaydi vardir sifreyi kontrol edelim
            int sayac=3;
            while (sayac>0){
                System.out.println("lutfen sifrenizi giriniz : ");
                String passw=input.nextLine();
                //sifre ile email ayni indexte mi?
                int index=emails.indexOf(email);
                if (passwords.get(index).equals(passw)){
                    System.out.println("Sisteme basarili bir sekilde giris yaptınız,Hosgeldiniz");
                    break;
                }else {
                    sayac--;
                    System.out.println("sifrenizi yanlis ya da eksik girdiniz lutfen tekrar deneyinizi kalan deneme hakkı : "+sayac);
                    if (sayac==0){
                        throw new passwordException("deneme hakkınız bitti 15 dk sonra tekrar deneyiniz");
                    }
                }
            }
        }else {//Kullanicin kaydi yoktur tekrar denemesini soyleyelim
            System.out.println("Sisteme kayitli bir kullanici bulunamadi");
            System.out.println("");
        }

    }




    private boolean validatePassword(String password) {
        boolean isValid;
        boolean space=password.contains(" ");
        boolean length=password.length()>5;
        boolean kucukHarf=password.replaceAll("^[a-z]","").length()>0;
        boolean buyukHarf=password.replaceAll("^[A-Z]","").length()>0;
        boolean rakam=password.replaceAll("^[0-9]","").length()>0;
        boolean sembol=password.replaceAll("[\\P{Punct}]","").length()>0;

        if (space){
            System.out.println("password bosluk karakteri iceremez");
        }
        if (length){
            System.out.println("password en az 6 karakter olmalıdır");
        }
        if (kucukHarf){
            System.out.println("password en az 1 tane kucuk harf icermelidir");
        }
        if (buyukHarf){
            System.out.println("password en az 1 tane buyuk harf icermelidir");
        }
        if (rakam){
            System.out.println("password en az 1 tane rakam icermelidir");
        }
        if (sembol){
            System.out.println("password en az 1 tane sembol icermelidir");
        }
        isValid=!space&&length&&kucukHarf&&rakam&&sembol;
        if (!isValid){
            System.out.println("Lutfen gecerli bir sifre ile tekrar deneyiniz ");
        }
        return isValid;
    }


    private boolean validateEmail(String email) {







        boolean isValid=false;
        boolean space=email.contains(" ");
        boolean containsAt=email.contains("@");

        if (space){
            System.out.println("Email bosluk iceremez");
            isValid=false;
        }
        if (!containsAt){
            System.out.println("Email @ sembolunu icermelidir");
            isValid=false;
        }
        if (!space&&containsAt){
            String firstPart=email.split("@")[0];//alican
            String secondPart=email.split("@")[1];//gmail.com
            //firstpart kısmında sadece büyük-küçük harf,rakam yada -._ sembolleri olabilir.
            boolean notValidChar=firstPart.replaceAll("[a-zA-Z0-9-._]","").isEmpty();
            boolean checkSecond=secondPart.equals("gmail.com")
                    ||secondPart.equals("hotmail.com")
                    ||secondPart.equals("yahoo.com");
            if (!notValidChar){
                System.out.println("Email harf,rakam ve -_. sembolleri disinda karakter iceremez");
            }
            if (!checkSecond){
                System.out.println("Email gmail.com,hotmail.com veya yahoo.com ile bitmelidir");
            }
            isValid=notValidChar&&checkSecond;
            if (!isValid){
                System.out.println("Gecersiz email, tekrar deneyiniz");
            }
        }
        return isValid;


        }}

