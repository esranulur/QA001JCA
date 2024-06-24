package day33_Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class Lambda06 {
    public static void main(String[] args) {



        //ornek 11: Bir List'teki karakter sayisi 5’den cok olan tum elemanlari
// buyuk harflerle bir listin icinde veren method'u olusturunuz.

        List<String> mylist = new ArrayList<>();

        mylist.add("Ali");
        mylist.add("Elif");
        mylist.add("Yusuf");
        mylist.add("Arda");
        mylist.add("Niyazi");
        mylist.add("Esra");
        mylist.add("Hasan");
        mylist.add("Hüseyin");
       List<String>yeniList=bestenUstuBuyuk(mylist);
        System.out.println(yeniList);


    }
    //ornek 11: Bir List'teki karakter sayisi 5’den cok olan tum elemanlari
    // buyuk harflerle bir listin icinde veren method'u olusturunuz.

    public static List<String> bestenUstuBuyuk(List<String>mylist){
//collect(Collectors.toList()) - Java'nın Stream API'sindeki bir işlemdir.
// Bu işlem, bir stream'de işlenmiş olan elemanları bir listeye toplar.

        return mylist.stream().
                filter(t->t.length()>5).
                map(t->t.toUpperCase()).
                collect(Collectors.toList());



    }
}