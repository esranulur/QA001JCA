package day26_Maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps05 {

    public static void main(String[] args) {

        //ornek 2: Size verilen bir String'deki her harfin o String'de kac defa kullanildigini gosteren kodu yaziniz.
//          “Hello” ==> H=1, e=1, l=2, o=1


        String s="Hellooo";
        s=s.toLowerCase();
        System.out.println(s);
        String []karakter=s.split(" ");
        System.out.println(Arrays.toString(karakter));


        HashMap<String,Integer> myMap=new HashMap<>();
        System.out.println(myMap);//{}

        for (String karakt:karakter) {
            Integer gorunum=myMap.get(karakt);
            if (gorunum==null){
                myMap.put(karakt,1);
            }else {
                myMap.put(karakt,gorunum+1);
            }
        }

        System.out.println(myMap);//{e=1,h=1}
    }
    //        for (String karakter : karakterler) {
    //            myMap.merge(karakter, 1, Integer::sum);
    //        }
}



