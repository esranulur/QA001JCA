package Proje.aracSigortaApp;

import java.util.Scanner;

public class Arac {
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
public String type;

public int prim;

    public void primHesaplama(int donem) {
    //tipine gore hesaplama}

        switch (this.type){
            case "otomobil":
                this.prim=donem==1?2000:2500;

                break;

            case "kamyon":
                this.prim=donem==1?3000:3500;
                break;

            case "otobus":
                primHesaplaOtobus(donem);
                break;

            case "motosiklet":
                this.prim=donem==1?1500:1750;
                break;
            default:
                System.err.println("hatali giris !!1");
                this.prim=0;
                break;

        }
}

    private void primHesaplaOtobus(int donem) {
        Scanner input=new Scanner(System.in);
        System.out.println("otobus tipini seciniz :  ");
        System.out.println("1.  18-30 arasi koltuk sayisi");
        System.out.println("2.  31-ve ustu koltuk sayisi");

int otobusTipi=0;
if (input.hasNextInt())
{otobusTipi=input.nextInt();

}else {
    System.out.println(" sadece otobus tipi numarasini giriniz !!");
    input.nextLine();
}
   switch (otobusTipi){
       case 1:
           this.prim=donem==1?4000:4500;
           break;
       case 2 :
           this.prim=donem==2?5000:5500;
           break;

       default:
           System.err.println("hatali giris!!");
           this.prim=0;
           break;



   }

    }





}
