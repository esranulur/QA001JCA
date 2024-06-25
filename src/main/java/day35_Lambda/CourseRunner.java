package day35_Lambda;


import day34_Lambda.Utils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CourseRunner {
    public static void main(String[] args) {
        //course class'in parametreli cons'unu kullanarak birkac object olusturalım
        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseGermanyDay = new Course("Summer", "Germany Day", 95, 132);
        Course courseGermanyNight = new Course("Winter", "Germany Night", 94, 144);
        List<Course> courseList = new ArrayList<>();
        courseList.add(courseTurkishDay);
        courseList.add(courseTurkishNight);
        courseList.add(courseGermanyNight);
        courseList.add(courseGermanyDay);
        System.out.println(courseList);
        //1)Tum "averageScore" larin 91’den buyuk olup olmadigini kontrol eden kodu yaziniz
        courseList.stream().filter(t -> t.getAverageScore() > 91).forEach(Utils::printInTheSameLineWithSpace);
        boolean result1 = courseList.stream().allMatch(t -> t.getAverageScore() > 91);
        System.out.println(result1);//true
        //2)Tum kurslardaki ögrenci sayilarinin 100’den buyuk olup olmadigini kontrol eden kodu yaziniz

        boolean result2 = courseList.stream().allMatch(t -> t.getNumberOfStudents() > 100);
        System.out.println(result2);//true

        //3)Kurs isimlerinden en az birinin "Turkish" kelimesini icerip icermedigini kontrol eden kodu yaziniz.


        //anyMatch,Akıştaki herhangi bir elemanın belirli bir koşulu karşılayıp karşılamadığını kontrol eder.
//Eğer akıştaki elemanlardan en az biri koşulu karşılıyorsa true döndürür, yoksa false döndürür.(VEYA gibi

        //allMatch metodu, akıştaki (stream) tüm öğelerin belirli bir koşulu karşılayıp karşılamadığını
// kontrol eder. Eğer akıştaki tüm öğeler bu koşulu sağlarsa true döndürür,
// aksi takdirde false döndürür.(VE gibi)

        boolean result3 = courseList.stream().anyMatch(t -> t.getCourseName().contains("TurkishX"));
        System.out.println(result3);


//4) Sezon isimlerinden en az birinin "Summer" kelimesini icerip icermedigini kontrol eden kodu yaziniz.


        boolean result4 = courseList.stream().anyMatch(t -> t.getSeason().contains("Summer"));
        System.out.println(result4);


        //5) Kurs donemleri icinde "Fall" doneminin hic bulunmadigini kontrol eden kodu yaziniz.
//noneMatch, Akıştaki hiçbir elemanın belirli bir koşulu karşılamadığını kontrol eder.
//Eğer akıştaki hiçbir eleman koşulu karşılamıyorsa true döndürür, aksi takdirde false döndürür.


        boolean result5 = courseList.stream().noneMatch(t -> t.getSeason().contains("Fall"));
        System.out.println(result5);

        //6) Kurs isimleri icinde "English" isminin hic bulunmadigini kontrol eden kodu yaziniz.


        boolean result6 = courseList.stream().noneMatch(t -> t.getCourseName().contains("English"));
        System.out.println(result6);


//7)Average score'u en yuksek olan kursun ismini console yazdiran kodu yaziniz.

//String name1=courseList.stream().sorted(Comparator.comparing(Course::getAverageScore).reversed()).findFirst().get().getCourseName();
      //  System.out.println(name1);

        //a) sorted, Stream içerisindeki elemanları doğal sıralamasına göre sıralar.(kucukten buyuge)
        //Özel bir sıralama için bir Comparator’da alabilir.
        //b) Comparator.comparing, belirli bir özelliğe göre elemanları sıralamak için bir Comparator oluşturur.
        //c) reversed, Bir Comparator'ın sıralama sırasını tersine çevirir.
        //d) findFirst, Stream'deki ilk elemanı döndüren bir Optional döner.

        String name = courseList.stream().max(Comparator.comparing(Course::getAverageScore)).
                get().
                getCourseName();
        System.out.println("name = " + name);
        String name1=courseList.stream().max(Comparator.comparing(Course::getAverageScore).reversed()).get().getCourseName();
          System.out.println(name1);
//
        /*String name =coursesList.stream().
                sorted(Comparator.comparing(Course::getAverageScore).reversed()).
                findFirst().
                get().
                getCourseName();
        System.out.println("name = " + name);*/

        //8) Tum course object'lerini average score'a gore kucukten buyuge diziniz
// ve ilk ikisi haric liste halinde console'a yazdiriniz.



//a) skip, Belirtilen sayıda elemanı Stream'den atlar. Burda ilk 2'sini atladik
//b) collect(Collectors.toList()), Stream içerisindeki elemanları bir listeye dönüştürür.
        List<Course> newList = courseList.stream().
                sorted(Comparator.comparing(Course::getAverageScore)).
                skip(2).
                collect(Collectors.toList()); // toList();

        System.out.println("newList = " + newList);



//9) Tum course object'lerini average score'a gore kucukten buyuge diziniz ve
// ilk ucunu liste halinde console'a yazdiriniz.


        List<Course> newList2 = courseList.stream().
                sorted(Comparator.comparing(Course::getAverageScore)).
                limit(3).toList();


        System.out.println("newList2 = " + newList2);
        //newList2 = [Course{season='Winter', courseName='Germany Night', averageScore=94.0, numberOfStudent=144},
        //            Course{season='Summer', courseName='Germany Day', averageScore=95.0, numberOfStudent=132},
        //            Course{season='Summer', courseName='Turkish Day', averageScore=97.0, numberOfStudent=128}]


        //10)Kursta bulunan ogrenci sayilarina gore buyukten kucuge sirali bir sekilde
        //Listin icinde veren kodu yaziniz

        List<Course> list = courseList.stream().
                sorted(Comparator.comparing(Course::getNumberOfStudents).reversed()).
                collect(Collectors.toList());
        System.out.println(list);

        //list = [Course{season='Winter', courseName='Turkish Night', averageScore=98.0, numberOfStudent=154},
        // Course{season='Winter', courseName='Germany Night', averageScore=94.0, numberOfStudent=144},
        // Course{season='Summer', courseName='Germany Day', averageScore=95.0, numberOfStudent=132},
        // Course{season='Summer', courseName='Turkish Day', averageScore=97.0, numberOfStudent=128}]


        List<Integer> list2 = courseList.stream().
                sorted(Comparator.comparing(Course::getNumberOfStudents).reversed()).
                map(Course::getNumberOfStudents).
                collect(Collectors.toList());
        System.out.println(list2); //[154, 144, 132, 128]


        // 11) Kursta bulunan Almanca bolumlerinin sayisini veren kodu yaziniz

        long germany = courseList.stream().filter(t->t.getCourseName().contains("Germany")).count();
        System.out.println("germany = " + germany); // germany = 2

        //12) Ogrenci sayisi 140’tan az olan kurslari bir liste halinde veren kodu yaziniz

        List<Course> list3 = courseList.stream().filter(t->t.getNumberOfStudents()<140).collect(Collectors.toList());
        System.out.println("list3 = " + list3);

        //list3 = [Course{season='Summer', courseName='Turkish Day', averageScore=97.0, numberOfStudent=128},
        //         Course{season='Summer', courseName='Germany Day', averageScore=95.0, numberOfStudent=132}]

    }

}
