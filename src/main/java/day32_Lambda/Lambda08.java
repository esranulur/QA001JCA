package day32_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda08 {
    public static void main(String[] args) {
        List<Integer> birListe = new ArrayList<>(Arrays.asList(1,5,4,3,9));
        guzelBirMethod(birListe);
    }
       /*
       bir listedeki elemanlardan 3'e bolunenlerin ilk once kupunu alıp sonra bunlarin toplamını bulan bir method olusturun
     */

    public static void guzelBirMethod(List<Integer> birListe){

        int toplam = birListe.
                stream().
                filter(t->t%3==0).
                map(t->t*t*t).
                reduce(0, Integer::sum);

        System.out.println(toplam);

    }


    //public static void guzelBirMethod(List<Integer> birListe) {
    //    double toplam=birListe.stream()
    //            .filter(t->t%3==0)
    //            .map(t->Math.pow(t,3))
    //            .reduce(0.0,Double::sum);
    //    System.out.println(toplam);
    //}


}
