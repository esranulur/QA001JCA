package day27_Maps;

import java.util.HashMap;
import java.util.Map;

public class Maps04 {
    public static void main(String[] args) {


  /*
Bir boş HashMap olusturup key degeri string value deger integer olucak sekilde ve key degerlerinden a harfini iceren degerleri getiriniz kucuk buyuk harfe duyarsızdır

*/


        HashMap<String,Integer>hm=new HashMap<>();

        hm.put("Selma",17);
        hm.put("Esra",25);
        hm.put("Niyazi",26);
        hm.put("Ahmet",23);
        hm.put("Ali Can",19);
        hm.put("Efe",19);
        hm.put("Ece",23);



                for (Map.Entry<String, Integer> entry : hm.entrySet()){
                    if (entry.getKey().toLowerCase().contains("a")){
                        System.out.println(entry);
                    }

//
        }


    }}
