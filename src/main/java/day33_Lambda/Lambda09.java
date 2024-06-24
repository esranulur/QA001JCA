package day33_Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda09 {
    public static void main(String[] args) {



//ornek 14: Bir List'teki elemanlari tekrarsiz olarak, kucuk harflerle, uzunluklarina gore
// kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.

        List<String> mylist = new ArrayList<>();

        mylist.add("Ali");
        mylist.add("Elif");
        mylist.add("Yusuf");
        mylist.add("Arda");
        mylist.add("Niyazi");
        mylist.add("Esra");
        mylist.add("Hasan");
        mylist.add("Hüseyin");
        kucukHarfUzunlukSiralama(mylist);
    }


    public static void kucukHarfUzunlukSiralama(List<String>mylist){


        mylist.stream().distinct().map(String::toLowerCase).sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }
}
