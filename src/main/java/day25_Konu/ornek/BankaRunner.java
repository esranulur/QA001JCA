package day25_Konu.ornek;

import java.util.LinkedList;
import java.util.Queue;

public class BankaRunner {
    public static void main(String[] args) {


        BankaSirasi insan1 = new BankaSirasi("ali can");
        BankaSirasi insan2 = new BankaSirasi("Veli can");
        BankaSirasi insan3 = new BankaSirasi("Huseyin Can");

        Queue<BankaSirasi> bankasirasi = new LinkedList<>();
        bankasirasi.add(insan1);
        bankasirasi.add(insan2);
        bankasirasi.add(insan3);
        System.out.println(bankasirasi);


        // for (BankaSirasi each:bankasirasi
        // ) {
        //if (each.sira==100){
        // System.out.println(each);

        long sayac =100;
        for (BankaSirasi each:bankasirasi
        ) {
            System.out.println("sira "+sayac+". kişidedir lutfen 1. nolu musteri temsilcisine gidiniz");
            if (each.sira==sayac){
                System.out.println(each.name+" bey lutfen 1. nolu musteri temsilcisine gidiniz");
            }
            sayac++;
        }
    }
}



