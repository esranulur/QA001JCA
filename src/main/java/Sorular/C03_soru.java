package Sorular;

public class C03_soru {
    public static void main(String[] args) {


        //assagidaki isleme bakiniz ve sonuclari dondurunuz


        boolean sonuc1=5>4&&7<9&&6+3==9&&5+2!=8;
        System.out.println(sonuc1);

        boolean sonuc2=5>4&&7>9&&6+3==9&&5+2!=8;
        System.out.println(sonuc2);

        boolean sonuc3=5>4&7>9&6+3==9&5+2!=8;
        System.out.println(sonuc3);



        int sayi1=40;
        int sayi2=60;
        int sayi3=30;

        System.out.println(sayi1>30&&sayi1<70);

        System.out.println(sayi3<100||sayi2>80);

        System.out.println(sayi2>=60&&sayi3!=70);

        System.out.println(sayi3!=sayi2&&sayi2>sayi1);

        System.out.println(sayi2<30||sayi2>50&&sayi2==70);
        System.out.println(sayi3 != sayi2 && sayi2 > sayi1);      // true

        System.out.println(sayi2 < 30 || sayi2 > 50 && sayi2 == 70);
    }

}
