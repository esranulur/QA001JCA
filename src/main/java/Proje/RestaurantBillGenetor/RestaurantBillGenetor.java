package Proje.RestaurantBillGenetor;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RestaurantBillGenetor {
/*
Proje: Restaurant Fiş Üretme Uygulaması(BillGenerator)
       1-Bir restaurantın online sipariş sisteminde hesabı
       yazdıran uygulama tasarlayınız.

       2-Restauranttaki yiyecekler bir listte tutulsun.
         Yiyeceklerin kodu, ismi ve ücreti olsun.

       3-Yiyecek menüsü gösterme, sipariş oluşturma/iptal ve hesap
         oluşturma için seçim menüsü gösterilsin.

       4-Yiyecek menü:Listedeki yiyecekler menü şeklinde listelensin
         Sipariş girme:Yiyeceğin kodu ve istenilen adet girilerek sipariş oluşturulsun
                       Her sipariş için kod üretilsin(başlangıç 1000 artarak devam eder)
                       Her bir yiyecek siparişi için tutar hesaplansın

         Sipariş iptal:Sipariş kodu girilerek sipariş silinsin
         Hesap oluşturma: Tutarları ile birlikte tüm siparişleri ve
                          toplam tutarı gösteren bir hesap fişi yazdırılsın.
*/



static ArrayList<Yiyecek> menu = new ArrayList<>();
static HashMap<Integer, Siparis> siparisler = new HashMap<>();
static int siparisKodu = 1000;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    menu.add(new Yiyecek(1001, "Baklava", 50.0));
    menu.add(new Yiyecek(1002, "Iskender", 80.0));
    menu.add(new Yiyecek(1003, "Salata", 30.0));
    menu.add(new Yiyecek(1004, "Sos", 5.0));
    menu.add(new Yiyecek(1005, "Sigara Boregi", 4.0));
    menu.add(new Yiyecek(1006,"Adana Kebap",90.0));
    menu.add(new Yiyecek(1010,"Gunun Corbasi",90.0));

    while (true) {
        System.out.println("1. Yiyecek menüsünü göster");
        System.out.println("2. Sipariş oluştur");
        System.out.println("3. Sipariş iptal et");
        System.out.println("4. Hesap oluştur");
        System.out.println("5. Çıkış");
        System.out.print("Seçiminizi yapın: ");
        int secim = scanner.nextInt();

        switch (secim) {
            case 1:
                menuyuGoster();
                break;
            case 2:
                siparisOlustur(scanner);
                break;
            case 3:
                siparisIptalEt(scanner);
                break;
            case 4:
                hesapOlustur();
                break;
            case 5:
                System.out.println("Çıkış yapılıyor...");
                scanner.close();

                break;
            default:
                System.out.println("Geçersiz seçim.");
        }
    }
}

static void menuyuGoster() {
    System.out.println("\n--- Menü ---");
    for (Yiyecek yiyecek : menu) {
        System.out.println("Kod: " + yiyecek.kod + " | İsim: " + yiyecek.isim + " | Ücret: " + yiyecek.ucret + " TL");
    }
    System.out.println("-----------");
}

static void siparisOlustur(Scanner scanner) {
    System.out.print("Sipariş vermek istediğiniz yiyeceğin kodunu girin: ");
    int kod = scanner.nextInt();
    System.out.print("İstediğiniz adeti girin: ");

    int adet = scanner.nextInt();


    Yiyecek secilenYiyecek = null;
    for (Yiyecek yiyecek : menu) {
        if (yiyecek.kod == kod) {
            secilenYiyecek = yiyecek;
            break;
        }
    }

    if (secilenYiyecek != null) {
        Siparis yeniSiparis = new Siparis(siparisKodu++, secilenYiyecek, adet);
        siparisler.put(yeniSiparis.siparisKodu, yeniSiparis);
        System.out.println("Sipariş oluşturuldu. Sipariş Kodu: " + yeniSiparis.siparisKodu);
    } else {
        System.out.println("Geçersiz yiyecek kodu.");
    }

}

static void siparisIptalEt(Scanner scanner) {
    System.out.print("İptal etmek istediğiniz siparişin kodunu girin: ");
    int kod = scanner.nextInt();
    if (siparisler.containsKey(kod)) {
        siparisler.remove(kod);
        System.out.println("Sipariş iptal edildi.");
    } else {
        System.out.println("Geçersiz sipariş kodu.");
    }
}

static void hesapOlustur() {
    double toplamTutar = 0;
    System.out.println("-- Hesap Fişi ---");
    for (Siparis siparis : siparisler.values()) {
        System.out.println("Sipariş Kodu: " + siparis.siparisKodu + " | Yiyecek: " + siparis.yiyecek.isim + " | Adet: " + siparis.adet + " | Tutar: " + siparis.tutar + " TL");
        toplamTutar += siparis.tutar;
    }
    System.out.println("Toplam Tutar: " + toplamTutar + " TL");
    System.out.println("---------------");
}
}