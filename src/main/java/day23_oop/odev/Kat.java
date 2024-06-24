package day23_oop.odev;

import java.time.LocalTime;

public abstract class Kat extends Apartman{

    public String yanginTupu="Her katta Yangin topu bulunduruldugu zorunlu";

    public  abstract void kacinciKat();
    public boolean  lambaYaniyorMu;
    public void pano(){
        System.out.println("Panonun üstünde birkaç fatura bulunuyor");
        System.out.println("30-05-2024 tarihinde apartman toplantisi yapılıcaktir");
    };
       public void lambaYak(){
    LocalTime time = LocalTime.of(20,0,0);
   // if (time.getHour()<6||time.getHour()>19) {
      // System.out.println("Lamba yaniyor...");
       // System.out.println("Lamba yandi.");
       // lambaYaniyorMu=true;//
    }

 //esra hanımın
    public void lambaKapat() {
        LocalTime time = LocalTime.now();
        if (time.equals(time.withHour(6).withMinute(0).withSecond(0).withNano(0))) {
            System.out.println("Lamba kapatiliyor...");
            System.out.println("Lamba kapatildi.");
            lambaYaniyorMu=false;
        }
    }
    //niyazi beyin
//public void lambaKapat(){
//    LocalTime timeNow = LocalTime.now();
//    LocalTime time = LocalTime.of(6,0,0);
//    if (timeNow==time){
//        System.out.println("Lamba kapatiliyor...");
//        System.out.println("Lamba kapatildi.");
//        lambaYaniyorMu=false;
//    }


    }


