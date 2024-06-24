package day32_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {


        List<Integer> myList = new ArrayList<>(Arrays.asList(12, 34, 53, 67, 7, 9, 4, 1, 15));
        ciftleriYazdir1(myList);
        System.out.println();
        ciftleriYazdir2(myList);
    }

    //3) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak
// yazdiran method'u olusturunuz.(Structured)
    public static void ciftleriYazdir1(List<Integer> numb) {
        for (Integer w : numb
        ) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }
    //4) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak
//  yazdiran method'u olusturunuz.(Functional)


    public static void ciftleriYazdir2(List<Integer> numb) {
        numb.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
    }
}