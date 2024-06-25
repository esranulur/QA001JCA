package day34_Lambda;

import java.util.stream.IntStream;

public class Lambda02 {
    public static void main(String[] args) {
        int sum=getSumFromSevenToSeventy();
        System.out.println(sum);
        int carpim1=getMultiplicationFromThreeToNine1();
        System.out.println(carpim1);
        int carpim2=getMultiplicationFromThreeToNine1();
        System.out.println(carpim2);

    }

    //1)  7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz
    private static int getSumFromSevenToSeventy() {
        /*
        a) IntStream - primitive int değerleri üzerinde ardışık işlemler yapmayı sağlar.(LongStream, DoubleStream’de var)
        b) range - Belirtilen başlangıç (dahil) ve bitiş değerleri (haric) arasında ardışık sayıları
        temsil eden bir akış oluşturur.
        c) rangeClosed - Belirtilen başlangıç (dahil) ve bitiş değerleri (dahil) arasında ardışık sayıları
        temsil eden bir akış oluşturur.
        d) addExact - tam ekle - İki int veya long değerini toplar. Math class'tadir.
        e) getAsInt - OptionalInt sınıfında bulunan bir metottur.Eğer bir değer mevcutsa bu değeri döndürür.(IntStream kullaninca bunu kullaniriz)
        Eğer bir değer mevcut değilse bir NoSuchElementException hatası fırlatır.
         */
        return IntStream.
                rangeClosed(7,70).
                reduce(Math::addExact).
                getAsInt();
    }
    //2)  3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.
    //1.yol
    public static int getMultiplicationFromThreeToNine1(){
        //multiplyExact - İki int veya long değerini çarpar. Math class'tadir
        return IntStream.rangeClosed(3,9).reduce(Math::multiplyExact).getAsInt();
    }
    //2.yol
    public static int getMultiplicationFromThreeToNine2(){
        //multiplyExact - İki int veya long değerini çarpar. Math class'tadir
        return IntStream.range(3,10).reduce(0,Math::multiplyExact);
    }
}