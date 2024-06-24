package Proje.BiletRezervasyonApp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ticket {
//4.yolculuk tipi , yolcu bilgisi,koltuk no mesafe (km),Totalfiyat ; ya da ticket ile ilgili bilgiler
public double distance ;

public int typeNo;
public String seatNo;
 public double price;
    private Bus otobus;


    //5.-bilet fiyatini hesaplama


    public void getTotalPrice(int age ){
        int seat=Integer.parseInt(seatNo);
        double toplam =0;

        switch (this.typeNo){
            case 1 :
                toplam=seat%3==0?this.distance*1.2:this.distance*1;
                System.out.println("Toplam tutar: "+toplam);
                break;
            case 2://cift yon
                toplam=seat%3==0?this.distance*2.4:this.distance*2;
                System.out.println("Toplam tutar: "+toplam);//600 indirimli fiyar 520
                //cift yon indirimi

                toplam=toplam*0.8;
                System.out.println("cift yon indirimli total tutar :"+toplam);
                break;




        }// son tutardan yas indirimi


        if (age<13){
            toplam=toplam/2;
            System.out.println("12 yas alti indiirmli total tutar:"+toplam);
        }else if (age>64){
            toplam=toplam*0.7;
            System.out.println("65 yas ustu indirimle total tutar :"+toplam);




        }this.price=toplam;

    }//BILET BILGILERINI YAZDIRALIM

public void printTicket(Bus otobus){

    LocalDateTime dateTime=LocalDateTime.now();
    DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm a\ndd.MM.yy");
    System.out.println("*********************************");
    System.out.println("--Bilet Detayi--");
    System.out.println("Otobus Plakasi :"+otobus.plaka);
    System.out.println("otobus firmasi :"+otobus.firma);
    System.out.println("Hangi Peron:"  +otobus.peron);
    System.out.println("Mesafe :"+this.distance);

    System.out.println("yolculuk Tipi :"+(this.typeNo==1?"Tek yön":"Gidis-Donus"));
    System.out.println("Koltuk No      : "+this.seatNo);
    System.out.println("Toplam tutar   : "+this.price);
    System.out.println("Keyifli Yolculuklar Dileriz........");
    System.out.println(dtf.format(dateTime));
    System.out.println("*************************************");}
}
