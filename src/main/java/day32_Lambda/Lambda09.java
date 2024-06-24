package day32_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda09 {
    public static void main(String[] args) {



       /*Bir listedeki tekrarsiz elemanlardan 4e tam bolunenlerin karakoklerinin carpimini yazdirin
        */

        List<Integer> myList = new ArrayList<>(Arrays.asList(4,16,64));
        methodYazdir(myList);
    }

    private static void methodYazdir(List<Integer> myList) {
        double carpm=myList.stream()
                .distinct()
                .filter(t->t%4==0)
                .map(Math::sqrt)
                .reduce(1.0,(t,u)->t*u);
        System.out.println(carpm);
    }
}
