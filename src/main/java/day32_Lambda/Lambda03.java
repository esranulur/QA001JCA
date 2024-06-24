package day32_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda03 {
    public static void main(String[] args) {List<Integer> myList = new ArrayList<>(Arrays.asList(12, 34, 53, 67, 7, 9, 4, 1, 15));
        bolmeyiYazdir1(myList);
        System.out.println();
        bolmeyiYazdir2(myList);
}
        //Ornek : bir listedeki elemanlardan 5'e tam bolunenleri yazdiran bir method olusturun(Structured)
//Ornek : bir listedeki elemanlardan 5'e tam bolunenleri yazdiran bir method olusturun(Functinol)




    //Stream API'si ile birlikte sıkça kullanılan bazı metodlar şunlardır:
//1) filter(): Koşulu karşılayan elemanları filtreler.


        public static void bolmeyiYazdir1(List<Integer> numb) {
            for (Integer w : numb
            ) {
                if (w % 5 == 0) {
                    System.out.print(w + " ");

                }}

    }
                public static void bolmeyiYazdir2(List<Integer> numb) {
                    numb.stream().filter(t -> t % 5 == 0).forEach(t -> System.out.print(t + " "));}}