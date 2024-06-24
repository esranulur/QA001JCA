package day14ArraysList;

import java.util.ArrayList;

public class ArrayList04 {
    public static void main(String[] args) {
        //Ornek 1:  Bir String ArrayList oluşturun ve "a" içeren elemanlari silin.
        ArrayList<String>list=new ArrayList<>();
        list.add("Esra Hanım");
        list.add("Niyazi Bey");
        list.add("Ahmet Hoca");
        list.add("Cem Bey");
//bir eleman silcegimiz zaman foreach dongusu kullanamayiz cunku foreach kac eleman var o eleman sayisi kadar donmeye kodlanir
        for (int i = 0; i <list.size() ; i++) {

            if (list.get(i).contains("a")){
                list.remove(i);
                i--;//azaltmazsak bazi indexleri atlar..

            }



        }
        System.out.println(list);
    }}
