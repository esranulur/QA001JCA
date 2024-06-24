package Proje.aracSigortaApp;

import java.util.Scanner;

public class AracSigortaApplication {
    /*
Proje: Araç Sigorta Prim Hesaplama
       Araç tipleri:otomobil, kamyon, otobüs, motosiklet
                    -otobüs: 18-30 koltuk veya 31 ve üstü koltuk

       Tarife dönemi:Aralık 2024,Haziran 2024
          1.dönem :Haziran 2024               2.dönem:Aralık 2024
          otomobil: 2000                       otomobil: 2500
          kamyon:   3000                       kamyon:   3500
          otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
          motosiklet: 1500                     motosiklet: 1750

        1-Tekrar tekrar kullanılan bir seçim menüsü(form) gösterelim.//while-switch
        2-Tarife dönemi bilgisi,araç tipi bilgilerini kullanıcıdan alalım.
        3-Hatalı girişte hesaplama başarısız uyarısı verip tekrar menü(form) gösterilsin.
        4-Menüde yeni işlem veya çıkış için seçenek sunulsun .
        5-tarife dönemi ve araç tipine göre sigorta primi hesaplansın.
 */
    public static void main(String[] args) {
        //1- uygulamayı baslatan bir method olusturalım
        start();
    }

    public static void start() {
        //2. kullanıcıdan bilgi almak icin scanner objesi olusturalım
        Scanner input=new Scanner(System.in);
        //3. olarak tekrar tekrar menu gosterilsin
        boolean isAgain=false;
        do {
            System.out.println("--Zorunlu Araç Sigorta Prim Hesaplama--");
            System.out.println("Tarife Donemi Seciniz : ");
            System.out.println("1. Haziran 2024");
            System.out.println("2. Aralık 2024");
            int donem;
            if (input.hasNextInt()){
                donem=input.nextInt();
            } else {
                System.out.println("Sadece kacinci donem oldugunu giriniz!!!");
                input.nextLine();//dummy
                isAgain=true;
                continue;
            }
            String donemBilgi=donem==1?"Haziran 2024":"Aralık 2024";
            //tarife donem bilgisi dogru girilir ise calistırmaya devam et hatalı giris ise basa geri dondur
            if (donem!=1&&donem!=2){
                System.err.println("Hatali giriş!!!");
              isAgain=true;
                continue;
            }
            //4. bir arac objesi olusturalım
            Arac arac=new Arac();//default
            System.out.println("Arac tipini seciniz: ");
            System.out.println("otomobil, kamyon, otobüs, motosiklet");//OTOMOBİL
            arac.type=input.next().toLowerCase();

arac.primHesaplama(donem);

//prim==0 ise hatali giris yapmis yani islem yapsin
            // prim>0 ise hesaplama islemi basarali bir sekilde yapilmistir sonucu gosterlim
            if (arac.prim>0){
                System.out.println("--------------------");
                System.out.println("arac tipi : "+ arac.type);
                System.out.println("tarife Donemi: "+ donemBilgi);
                System.out.println("Aracinizin ilgili donem sigorta primi :"+arac.prim);
                System.out.println("-----------------------------------");
                System.out.println("Yeni islem icin 1,cikis icin 0 ´i seciniz");
                int select=input.nextInt();
                isAgain=select==1?true:false;
            }
else {
                System.out.println("Hesaplama islemi basarisiz,tekrar deneyiniz");
                System.out.println("Yeni islem icin 1,cikis icin 0 ´i seciniz");
                int select=input.nextInt();
                isAgain=select==1?true:false;
            }





        }while (isAgain);
    }

}
