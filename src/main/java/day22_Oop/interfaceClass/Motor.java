package day22_Oop.interfaceClass;

public interface Motor {
/*Interface (arayüz), class'larin uygulayabileceği bir "sözleşme" olarak düşünülebiliriz

 Bir interface, bir veya daha fazla abstract method içerir

bu methodların imzalarını (adlarını ve parametrelerini) belirtir,

ancak bu methodların nasıl uygulanacağını tanımlamaz.

Class'lar, bu interface'leri uygulayarak (implement ederek) bu methodları

kendi ihtiyaçlarına göre tanımlarlar.*/


//i) interface icindeki method’lar otomatik olarak ‘public’ dir,

// bu yuzden interface’lerde method olustururken access modifier yazmayiz.(static degillerdir)


    /*
1) interface'lerden object olusturamazsiniz.(constructor'lari olmadigi icin eksik yapilardir)
2) interface'ler sadece parent olur
3) interface'ler yapilmasi sart olan seyleri depolamak icin olusturulur.
Bu yüzden interface'lere "to do list " de denir.(yapilacaklar listesi)

       child              parent

       class              class       ==> extends
       interface          interface  ==> extends -->Bir interface baska bir interface'in child'i olabilir

       class              interface  ==> implements
       interface          class      ==> olamaz -->Bir interface baska bir class'in child'i olamaz



       */
    /*4- Coklu interface parentlarin her birinin icine ayni isimli methodlar koyabiliriz
Mesela Motor'un, Klima'nin ve Fren'nin iclerine run() methodu koymak gibi.
Child class bu methodu override ettiginde bu methodun hangi interface'den geldiği belirsizdir.*/



    void eco();


    void turbo();

    void gas();

void run ();
}