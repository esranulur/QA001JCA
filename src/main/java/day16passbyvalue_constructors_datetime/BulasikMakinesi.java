package day16passbyvalue_constructors_datetime;

public class BulasikMakinesi {
/*
pasif ozellikler
marka
model
renk
kapasite
bunlarla beraber birde constructor olusturalım
 */


    String marka;
    String model;
    String renk;
    String kapasite;

    @Override
    public String toString() {
        return "BulasikMakinesi{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", kapasite='" + kapasite + '\'' +
                '}';
    }

    public BulasikMakinesi(String marka, String model, String renk, String kapasite) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.kapasite = kapasite;


    }
}