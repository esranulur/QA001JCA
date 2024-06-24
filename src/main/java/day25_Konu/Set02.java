package day25_Konu;

import java.util.LinkedHashSet;

public class Set02 {
    public static void main(String[] args) {


        LinkedHashSet<String>linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("ali can");
        linkedHashSet.add("veli can");
        linkedHashSet.add("huseyin can");
        linkedHashSet.add(" emre can");
        linkedHashSet.add("ali can");
        System.out.println(linkedHashSet);

        LinkedHashSet<String>linkedHashSet1=new LinkedHashSet<>();
        linkedHashSet1.add("ali can");
        linkedHashSet1.add("veli can");
        linkedHashSet1.add("Ahmet ");
        linkedHashSet1.add(" Niyazi");
        System.out.println(linkedHashSet.retainAll(linkedHashSet1));
        System.out.println(linkedHashSet);
        //retainAll() metodu, bir koleksiyondaki öğelerin başka bir koleksiyonla kesişimini
        // (yani her iki koleksiyonda da bulunan öğeleri-ortak) bulmak için kullanılır.
    }}
