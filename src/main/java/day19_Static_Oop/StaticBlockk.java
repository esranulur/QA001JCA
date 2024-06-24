package day19_Static_Oop;

import java.time.LocalDate;

public class StaticBlockk {
  /*"static" blok, bir class'in yüklenmesi sırasında otomatik olarak çalışan ve class'in başlatılmasını
veya başlangıç ayarlarını yapmayı sağlayan bir özelliktir. Statik blok, yalnızca bir kez çalıştırılır.
 Bu bloklar örneğin, veritabanı bağlantıları için kullanılır.
 Bu, uygulamanın herhangi bir bölümünde veritabanına erişim gerektiğinde bağlantının hızlı
 bir şekilde hazır olmasını sağlar.
 */

    //Bir variable olusturup deger atamazsaniz o variable'i initialize etmediniz demektir
    static double pi;//herhangi bir degeri yok
    static int price;


    /*
    bazi durumlarda variable'imizi main method oncesi kullanıma hazır hale getirmemiz gerekebilir
    bu durumlarda static block kullanılır
    static variabler static blocklar icinde initilaze edilirse o classin icinde herseyden once hazır hale gelir
     */

    public static void main(String[] args) {
        System.out.println(pi);//3.14//
        System.out.println("Main Method ici");
        System.out.println(price);//aslında cok fazla islemden gecti
    }

    static {//static block
        pi=3.12;
        System.out.println("Static block 2");
        LocalDate currentDay=LocalDate.now();//su anki tarihi alır
        if (currentDay.getMonthValue()==5) {//Mayıs ayımı diye kontrol eder
            //eger ay bilgisi 5 ise fiyat 1000 tl olarak aksi takdirde 1500 olarak ayarlıyalım
            price=1000;
            /***Bu kod, class yüklendiğinde bir kere çalışır
             // ve o anki tarihe bağlı olarak price değişkeninin
             // değerini ayarlar. ve herhangi bir yerde price değişkenine erişildiğinde
             // bu değer kullanılır.
             // ***Onden ayarlama yapmis oluruz.
             */



        }else {
            price=1500;
        }
    }

    static {//static block
        pi = 3.15;
        System.out.println("Static Block 1");
    }
    //Senaryo: Subat ayinda fiyatlarda indirim olacak. Class cagirildiginda otomatik price'i alacak
    //ve class'in heryerinde bu degeri kullanacak

/* instance (örnek) blok, bir Class'in her Object'i (nesnesi) oluşturulduğunda çalışan bir kod bloğudur.

  Instance bloklarının temel özellikleri şunlardır:

1- Her Örnek İçin Çalışır: Instance blok, bir class'in her örneği oluşturulduğunda çalışır.
Yani, her yeni object için bu blok tekrar çalışır.

2- Kod Tekrarını Önler: Instance blokları kullanarak, her Object'in başlatma işlemlerini veya belirli kod
parçalarını tekrar tekrar yazmaktan kaçınırsınız.

   Gerçek hayattan bir örnek: Bir otomobil Class'i düşünün. Her otomobilin örneği (nesnesi-object'i)
   oluşturulduğunda, otomobilin rengini ve yakıt türünü belirlemek için instance bloklarını kullanabilirsiniz.

    Örneğin: instance blok, her otomobil Object'i oluşturulduğunda çalışır ve
    otomobilin rengini siyah ve yakıt türünü benzin olarak başlatır.
   Bu, her yeni otomobilin aynı başlangıç değerleriyle başlamasını sağlar.
    Diger ozellikler sonra ayarlanir ki tekrardan kurtuluruz*/

}
