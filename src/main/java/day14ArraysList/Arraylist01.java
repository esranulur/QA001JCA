package day14ArraysList;

import java.util.ArrayList;

public class Arraylist01 {
    public static void main(String[] args) {
        ArrayList<Integer> ages=new ArrayList<Integer>();//java 6 ve öncesi icin kullanılan olusturma yontemi
        ArrayList<Integer> ages01=new ArrayList<>();//Java 7 ve sonrasi
/*
1) Arrayler'de primitive data type'lari ve non-primitive data type'lari depolayabilir
fakat arraylist'ler sadece non-primitive data turleri saklar
2) Arraylistler memory'de arrayler'den daha fazla yer kaplar
3) Arrayler'de olustururken bastan eleman sayisini belirtmek zorundayiz
4) Arraylistler ise eleman sayisi konusunda esnektir
5) Arrayler cok hızlı yapıdadir ve memory'de az yer kapladigi icin belli sayidaki elemanlar icin kullanilir
 */

//ArrayList'lere eleman nasil eklenir?

        ages.add(1);
        ages.add(2);
        ages.add(3);
        ages.add(4);
        ages.add(5);
        System.out.println(ages);

//List'te araya eleman eklemek icin index numarasini yazariz
        ages.add(2,90);
        System.out.println(ages);
        ages.add(4,50);
        System.out.println(ages);
     //ArrayList<Integer> ages=new ArrayList<Integer>();//java 6 ve öncesi icin kullanılan olusturma yontemi
        ArrayList<Integer> newAges=new ArrayList<>();//Java 7 ve sonrasi
/*
1) Arrayler'de primitive data type'lari ve non-primitive data type'lari depolayabilir
fakat arraylist'ler sadece non-primitive data turleri saklar
2) Arraylistler memory'de arrayler'den daha fazla yer kaplar
3) Arrayler'de olustururken bastan eleman sayisini belirtmek zorundayiz
4) Arraylistler ise eleman sayisi konusunda esnektir
5) Arrayler cok hızlı yapıdadir ve memory'de az yer kapladigi icin belli sayidaki elemanlar icin kullanilir
 */

//ArrayList'lere eleman nasil eklenir?

        ages.add(1);
        ages.add(2);
        ages.add(3);
        ages.add(4);
        ages.add(5);
        System.out.println(ages);

//List'te araya eleman eklemek icin index numarasini yazariz
        ages.add(2,90);
        System.out.println(ages);
        ages.add(5,50);
        System.out.println(ages);

//Ornek 1: Verilen Integer List'i, ages List'inin icine koyunuz

        System.out.println(newAges);
        newAges.add(10);
        newAges.add(20);
        newAges.add(30);
        ages.addAll(2,newAges);
        System.out.println(ages);
        System.out.println(ages.size());
//size() methodu : arraylistteki ogelerin toplam sayisini dondurur

        System.out.println(ages.get(3));
//get(int index)methodu : arraylistteki istedigimiz indexdeki elemani bize dondurur

        System.out.println(ages.set(3, 25));
        System.out.println(ages);
//set(int index,Integer element ) : methodu arraylistte belirtilen indexteki öğeyi verilen yeni eleman yapar
//ve bize eski olan yani güncellenen elemani dondurur

    }}
