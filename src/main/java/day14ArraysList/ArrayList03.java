package day14ArraysList;

import java.util.ArrayList;

public class ArrayList03 {
    public static void main(String[] args) {


        //Ornek 1: Tekrarli elemanlari olan bir listten, tekrarsiz elemanlari olan bir list elde ediniz.
//           [J, a, v, a, v,n] ==> [J, a, v]
        ArrayList<Character> karakterler=new ArrayList<>();
        karakterler.add('J');
        karakterler.add('a');
        karakterler.add('v');
        karakterler.add('a');
        karakterler.add('v');
        karakterler.add('b');
        karakterler.add('u');
        karakterler.add('g');
        karakterler.add('u');
        karakterler.add('n');
        karakterler.add('c');
        karakterler.add('o');
        karakterler.add('k');
        karakterler.add('k');
        karakterler.add('o');
        karakterler.add('l');
        karakterler.add('a');
        karakterler.add('y');
        System.out.println(karakterler);//[J, a, v, a, v]
        ArrayList<Character>yeniKarakter=new ArrayList<>();

        for (Character w : karakterler) {
            if (!yeniKarakter.contains(w)){
                yeniKarakter.add(w);
            }

        }
        System.out.println(yeniKarakter);
    }}
