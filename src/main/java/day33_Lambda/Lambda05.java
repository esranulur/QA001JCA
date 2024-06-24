package day33_Lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda05 {
    public static void main(String[] args) {


        //ornek 10: Bir List'te karakter sayisi 5’den az olan tum elemanlari
// tekrarsiz olarak console'a yazdiran method'u olusturunuz.

        List<String> mylist = new ArrayList<>();

        mylist.add("Ali");
        mylist.add("Elif");
        mylist.add("Yusuf");
        mylist.add("Arda");
        mylist.add("Niyazi");
        mylist.add("Esra");
        mylist.add("Hasan");
        mylist.add("Hüseyin");
bestenAzTekrarsiz(mylist);


    }

    public static void bestenAzTekrarsiz(List<String>mylist) {
        mylist.stream().distinct().filter(t -> t.length()<5).forEach(System.out::println);

    }
    }
