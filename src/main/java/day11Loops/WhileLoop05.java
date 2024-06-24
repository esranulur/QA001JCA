package day11Loops;

import java.util.Random;
import java.util.Scanner;

public class WhileLoop05 {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
// kullanicidan bu sayiyi tahmin etmesini isteyin
// girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
// kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
// Random rnd=new Random();
// int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur

        Scanner input=new Scanner(System.in);//kullanıcıdan bilgi alacagimiz icin scanner objesini olusturduk

        Random rnd=new Random();//random objesi olusturduk bu bize random bir seyler olusturmayi saglar
        int sayi=rnd.nextInt(100);//random sayimizi olusturduk

        int kullaniciSayi;
        int tahminSayisi=0;
        while (true){
            System.out.println("lutfen tahminde bulunmak icin 1-100 arasinda bir sayi giriniz");
            kullaniciSayi=input.nextInt();
            tahminSayisi++;
            if (kullaniciSayi>sayi){
                System.out.println("lutfen daha kucuk sayi giriniz");
            } else if (kullaniciSayi<sayi) {
                System.out.println("lutfen daha buyuk sayi giriniz");
            }else {
                System.out.println(tahminSayisi+". tahminde buldunuz : "+sayi);
                break;
            }


        }


        //eger kullanıcıya 5 tahmin hakkı vermis olsaydik
// for (int i = 4; i >=0 ; i--) {
//     System.out.println("lutfen tahminde bulunmak icin 1-100 arasinda bir sayi giriniz");
//     kullaniciSayi= input.nextInt();
//     if (kullaniciSayi>sayi){
//         System.out.println("lutfen daha kucuk sayi giriniz");
//     } else if (kullaniciSayi<sayi) {
//         System.out.println("lutfen daha buyuk sayi giriniz");
//     }else {
//         System.out.println("Evet dogru sayiyi buldunuz tebrikler : "+sayi);
//         break;
//     }
//     System.out.println("kalan tahmin hakkınız : "+i);
// }





/*
forloop: dongu sayisi belliyse kullanırız
whileLoop: dongu sayisi belli degilse bunu kullanırız
do whileLoop: en az bir kere calismasini istedigimi fakat dongu sayisi belli olmayan yapılarda kullanırım
 */

    }

}
