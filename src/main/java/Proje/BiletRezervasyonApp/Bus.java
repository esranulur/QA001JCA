package Proje.BiletRezervasyonApp;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    //2- plaka ve koltuk no ya da otobus bilgilerini doldurduk
    String plaka ;
    String firma;
    String peron;


    public List<String>seats=new ArrayList<>();

    public Bus(String s, String techpro, String peron) {

        this.plaka=plaka;
        this.firma=firma;
        this.peron=peron;

        for (int i = 1; i <=32 ; i++) {
            this.seats.add(String.valueOf(i));
        }


    }
}
