package Proje.RestaurantBillGenetor;

public class Siparis {
    int siparisKodu;
    Yiyecek yiyecek;
    int adet;
    double tutar;

    Siparis(int siparisKodu, Yiyecek yiyecek, int adet) {
        this.siparisKodu = siparisKodu;
        this.yiyecek = yiyecek;
        this.adet = adet;
        this.tutar = adet * yiyecek.ucret;
    }
    void guncelleAdet(int yeniAdet) {
        this.adet = yeniAdet;
        this.tutar = yeniAdet * yiyecek.ucret;
}}
