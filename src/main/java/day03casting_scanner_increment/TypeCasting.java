package day03casting_scanner_increment;

public class TypeCasting {


    /*
Type Casting -> tip dönüştürmek
Sayisal primitive data turlerinin birbirine donusturulmesine typecasting denir
 */

    public static void main(String[] args) {

        byte a=25;
        short b=a;
        System.out.println(b);
    /*
    not 1) kucuk data type'lar buyuk data type'lara cevilirebilir java bunu otomatik olarak yapar
    bu isleme de biz autowiding(otomatik genişleme) denir
     */



        //Ornek 1: byte data type' ini int data type'ina ceviriniz.==>AutoWidening“ (Otomatik genisletme)
//Example 1: Convert byte data type to int data type.

        byte c = 12;
        int d = c;
System.out.println(d);

//Ornek 2 : int data type' ini short data type' ina ceviriniz.Explicit Narrowing (Aciktan Daraltma)
//Example 2: Convert int data type to short data type.

int sayi1=(short)250;

double e=25.678;
int f=(int)e;
System.out.println(f);

//int sayi1=32780;
//short sayi2=(short) sayi1;
//System.out.println(sayi2);

      //  double e=25.678;
      //  int f=(int)e;
        System.out.println(f);

       // int sayi1=257;
      //  byte sayi2=(byte) sayi1;
      //  System.out.println(sayi2);

        System.out.println(e+sayi1);//282.678








}}
