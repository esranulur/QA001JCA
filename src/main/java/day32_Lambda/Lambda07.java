package day32_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda07 {
    public static void main(String[] args) {
        //1) Bir list'teki "Tekrarsiz" elemanlardan "çift" olanlarin "karesinin"
// "çarpımını" hesaplayan bir method oluşturun


        List<Integer> numb = new ArrayList<>(Arrays.asList(2, 3, 4,3, 5,6,7,8,6, 10, 10));
        tekrarsizCiftKareCarpimi(numb);


    }

    public static void tekrarsizCiftKareCarpimi(List<Integer>numb){




        int carpma= numb.
                stream().
                distinct().
                filter(t->t%2==0).
                map(t->t*t).
                reduce(1,(t, u) -> t * u) ;
        System.out.println(carpma);
    }

}
