package day33_Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda08 {
    public static void main(String[] args) {


//ornek 13: Bir List'teki elemanlari tekrarsiz olarak, buyuk harflerle, alfabetik sirada
// console'a yazdiran method'u olusturunuz.


        List<String> mylist = new ArrayList<>();

        mylist.add("Ali");
        mylist.add("Elif");
        mylist.add("Elif");
        mylist.add("Yusuf");
        mylist.add("Yusuf");
        mylist.add("Arda");
        mylist.add("Niyazi");
        mylist.add("Esra");
        mylist.add("Hasan");
        mylist.add("Hüseyin");

        dogalSiralamayazdir(mylist);

    }
    public static void dogalSiralamayazdir(List<String>mylist){


        mylist.stream().distinct().map(String::toUpperCase).sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }
    }

