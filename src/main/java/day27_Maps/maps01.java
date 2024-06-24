package day27_Maps;

import java.util.HashMap;
import java.util.Hashtable;

public class maps01 {
    public static void main(String[] args) {


       /*Thread Safe (İş Parçacığı Güvenliği):
Thread safe, bir yazılımın veya veri yapısının birden fazla iş parçacığı tarafından aynı anda erişilirken
beklenen davranışı sergileyebilmesi ve veri bütünlüğünü koruyabilmesi anlamına gelir.
Banka hesabı yönetimi gibi örneklerde,birden fazla iş parçacığı (örneğin, birden fazla kullanıcının aynı anda
hesap işlemleri yapması) hesap bakiyesi gibi paylaşılan kaynaklara erişebilir.

Multi Thread (Çok İş Parçacıklı):
Multi thread, bir programın veya uygulamanın birden fazla iş parçacığı tarafından aynı anda çalıştırılabilmesi
anlamına gelir. Bu, yazılımın genel performansını ve yanıt süresini iyileştirebilir çünkü birden fazla işlem
paralel olarak gerçekleştirilebilir. Web tarayıcıları, bu kavramın güzel bir örneğidir;
çünkü kullanıcı arayüzünü donmadan, aynı anda birden fazla sekmede içerik yükleyebilir ve
kullanıcı etkileşimlerine yanıt verebilirler.

Synchronized:
Synchronized, bir metodun veya bloğun aynı anda sadece bir iş parçacığı tarafından erişilebilir olmasını
sağlayan bir anahtar kelimedir. Bu, özellikle paylaşılan kaynaklara erişimde veri tutarlılığını ve
bütünlüğünü korumak için kullanılır.*/



/*HashMap ile HashTable arasindaki fark nedir?
1)  a) HashMap non-synchronized'dir ve bu yuzden thread-safe degildir, yani birden fazla iş parçacığı
aynı anda HashMap nesnesine erişebilir. Bu, yüksek performanslı durumlar için avantajlı olabilir
ancak çoklu iş parçacığı ortamlarında veri tutarlılığını garantilemek için dış senkronizasyon
mekanizmaları kullanılmalıdır.(Programci Synchronized Bloklar, Lock ve Semapforlar gibi ozel yapilar kullanir.)

    b) HashTable synchronized ve thread-safe'dir
(yani aynı anda sadece bir iş parçacığı aynı Hashtable'i kullanabilir.
 kuyruk olusur ve hizmet suresi uzar)

2) a)HashMap bir tane null key'e (unique olmali, 2 null olamazdi, ustune yazar) ve
        istediginiz kadar null value'a musaade eder
   b)Hashtable, anahtarlar ve değerler için null değerlerine izin vermez.
   Herhangi bir null değer eklemeye çalışırsanız, NullPointerException alırsınız.

3) HashMap hizlidir, HashTable HashMap'e gore yavastir

Not: HashMap'ler ve HashTable'lar entry'leri rastgele siralar*/



/*--------------------
Hangi veri yapısını kullanmalısınız?

Senkronizasyona gerek yoksa, HashMap kullanın. Bu, daha yüksek performans sağlayacaktır.
Senkronizasyon gerekliyse, Hashtable kullanın. Bu, veri tutarsızlığı riskini azaltacaktır.
 */

        Hashtable<String,Integer>ogrenciNotlari=new Hashtable<>();
        ogrenciNotlari.put("Selma",70);
        ogrenciNotlari.put("Esra",95);
        ogrenciNotlari.put("Niyazi",95);
        ogrenciNotlari.put("Ahmet",60);
        ogrenciNotlari.put("Ali Can",45);
//ogrenciNotlari.put(null,0);hashtable icin key kisim null deger olamaz
  //     ogrenciNotlari.put("Veli Can ",null);value degeride null olamaz

        System.out.println(ogrenciNotlari);

        HashMap<String,Integer>stdAges=new HashMap<>();
        stdAges.put("Selma",17);
        stdAges.put("Esra",25);
        stdAges.put("Niyazi",26);
        stdAges.put("Ahmet",23);
        stdAges.put("Ali Can",19);
        stdAges.put(null,23);
        stdAges.put(null,46);
        stdAges.put("a",null);
        stdAges.put("b",null);
        System.out.println(stdAges);


        HashMap<String,String> stdName_Project = new HashMap<>();
        stdName_Project.put("Niyazi","Advanced Java");
        stdName_Project.put("Esra","Quality Assurance");
        stdName_Project.put("Ahmet","Java Developer");


        Hashtable<String,String>name_IBAN = new Hashtable<>();
        name_IBAN.put("Niyazi","1234 4321 1234 4321");
        name_IBAN.put("Esra","5678 9876 4567 5432");
        name_IBAN.put("Ahmet","9876 5432 1234 5678");

    }}
