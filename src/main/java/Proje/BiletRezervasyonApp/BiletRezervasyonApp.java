package Proje.BiletRezervasyonApp;

import java.util.Scanner;

public class BiletRezervasyonApp {
/*
project: Bilet Rezervasyon ve Bilet Fiyatı Hesaplama Uygulaması

        1-Uygulama mesafe ve kurallara göre otobüs bileti fiyatı hesaplar sonuç olarak bilet bilgisini verir
        2- Kullanıcıdan     mesafe (KM),
        yolcu yaşı ,
        yolculuk tipi (Tek Yön, Gidiş-Dönüş)
        ve koltuk no bilgilerini alınır.
        NOT: Koltuk numaraları 1-32 aralığında olmalıdır.)
        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
        Aksi halde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

        3-Fiyat hesaplama kuralları:
        -Mesafe başına ücret:
        Tek yön: 1 Lira / km       Çift Yön(Gidiş-Dönüş): 2 Lira/km
        -Tekli Koltuk ücreti:
        Koltuk no 3 veya 3 ün katı ise fiyat %20 daha fazladır(Tek yön: 1.2 Lira/km, Çift Yön:2.4 Lira/km).
        -İlk olarak seferin mesafe, yön ve koltuk no bilgisine göre fiyatı hesaplanır,
        sonrasında koşullara göre aşağıdaki indirimler uygulanır ;
        i)-Çift Yön indirimi:
        "Yolculuk Tipi" gidiş dönüş seçilmiş ise son bilet fiyatı üzerinden %20 indirim uygulanır.
        ii)-Yaş indirimi:
        Kişi 12 yaşından küçükse son bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 65 yaşından büyük ise son bilet fiyatı üzerinden %30 indirim uygulanır.

        */

    public BiletRezervasyonApp() {
    }

    public static void main(String[] args) {
//1-bilet rezervasyonu yapabilmek icin bir otobuse ihtiyacimiz var
        Bus bus = new Bus("80 ab 80", "techpro", "peron");//

//3-bilet objesi olusturup biletle ilgili ozellikleri
        Ticket ticket = new Ticket();
        ticket.printTicket(bus);
        //7-uygulamayi baslatan bir method

        start(ticket, bus);


    }

    public static void start(Ticket ticket, Bus bus) {
        //kullanicidan bilgileri alalim
        //
        //
        Scanner input = new Scanner(System.in);
        int select = 0;

        do {


            System.out.println("Bilet rezervasyon uygulamasina hosgeldiniz ");
            System.out.println("lutfen mesafe bilgisini km olarak giriniz ");
            double distance = input.nextDouble();

            System.out.println("Lutfen yolculuk tipini seciniz : ");
            System.out.println("1.tek yon ");
            System.out.println("2.Gidis -donus");
            int type = input.nextInt();
            System.out.println("Lutfen yasinizi giriniz");
            int yas = input.nextInt();
            System.out.println("Lutfen koltuk no seciniz");
            System.err.println("tekli koltuk ucreti %20 daha fazladir");
            System.out.println(bus.seats);
            String seat = input.next();
            boolean isReserved = !bus.seats.contains(seat);
            if (isReserved) {
                System.out.println("Secilen koltuk rezerve edilmiştir");
            }
//girilen degerler gecerli mi?


            if (yas > 0 && distance > 0 && (type == 1 || type == 2) && !isReserved) {
//girilen degerler gecerli mi?
                if (yas > 0 && distance > 0 && (type == 1 || type == 2) && !isReserved) {
                    //girilen degerler gecerli ise listeden koltugumuzu silelim
                    bus.seats.remove(seat);

                    //bileti olusturalim
                    ticket.distance = distance;
                    ticket.seatNo = seat;
                    ticket.typeNo = type;
                    ticket.getTotalPrice(yas);
                    //bileti yazdiralim
                    ticket.printTicket(bus);
                }
                } else {
                    //girilen degerler yanlıs ise
                    System.out.println("Hatali veri girdiniz!! lutfen tekrar deneyiniz");
                }
                System.out.println("Yeni islem icin bir sayi giriniz,Cıkış icin 0'i seciniz");
                select = input.nextInt();

            }
            while (select != 0) ;
            System.out.println("iyi gunler dileriz ve tekrar bekleriz");

        }

    }
