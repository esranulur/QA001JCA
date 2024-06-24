package day32_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda04 {
    public static void main(String[] args) {


//1) Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk
// koyarak yazdiran method'u olusturunuz.(Functional)



        List<Integer> myList = new ArrayList<>(Arrays.asList(12, 34, 53, 67, 7, 9, 4, 1, 15));
tekKareYazdir(myList);
    }



public  static void tekKareYazdir(List<Integer>myList){
        //map():Elemanlari donusturmek icin kullanilir
    myList.stream().filter(t -> t % 2 != 0).map(t -> t*t ).forEach(t->System.out.print(t + " "));


    }
}
