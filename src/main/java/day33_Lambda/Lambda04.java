package day33_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda04 {
    public static void main(String[] args) {


//ornek 9: Bir List'teki E ile baslayanlar haric tum elemanlari
// console'a yazdiran method'u olusturunuz.

        List<String> mylist = new ArrayList<>();

        mylist.add("Ali");
        mylist.add("Elif");
        mylist.add("Yusuf");
        mylist.add("Arda");
        mylist.add("Niyazi");
        mylist.add("Esra");
        mylist.add("Hasan");
        mylist.add("Hüseyin");
        eHaric(mylist);

    }


//ornek 9: Bir List'teki E ile baslayanlar haric tum elemanlari
//console'a yazdiran method'u olusturunuz.
public static void eHaric(List<String>mylist){
    mylist.stream().filter(t->!t.startsWith("E")).forEach(System.out::println);
}
}


