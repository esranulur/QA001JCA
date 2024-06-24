package day31_enum_iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIterator01 {
    public static void main(String[] args) {



       // Not: ListIterator, Iterator'ın bir alt arayüzüdür ve listeler üzerinde iki yönlü dolaşmanıza ve elemanların indekslerine erişmenize olanak tanır.
       // sadece List arayüzünü uygulayan sınıflarla (örneğin ArrayList, LinkedList gibi) kullanılabilir.



        List<String> yourList=new ArrayList<>(Arrays.asList("Ali","Can","Esra","Niyazi","Ahmet"));
        System.out.println(yourList);

        ListIterator<String>yourListItr=yourList.listIterator();
        while (yourListItr.hasNext()){
            String str =yourListItr.next();
            yourListItr.set(str+"*");

        }
        System.out.println(yourList);
        //2)elemanlari sondan basa dogru yazdirin

        ListIterator<String>yourListItr2=yourList.listIterator();
        while (yourListItr2.hasNext()){
            yourListItr2.next();

        }//bu loop pointerí en saga almak icin yazildi
        while (yourListItr2.hasPrevious()){
            System.out.println(yourListItr2.previous()+"<-- ");
        }

    }}
