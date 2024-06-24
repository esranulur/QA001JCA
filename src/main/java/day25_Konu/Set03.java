package day25_Konu;

import java.util.SortedSet;
import java.util.TreeSet;

public class Set03 {
    public static void main(String[] args) {
        //treeSet nasil olusturulur?


        TreeSet<Character>ts=new TreeSet<>();
        ts.add('g');
        ts.add('q');
        ts.add('a');
        ts.add('c');
        ts.add('f');
        ts.add('l');
        ts.add('o');
        ts.add('h');
        System.out.println(ts);
        //subset() belirli bir aralıktaki elemanları içeren yeni bir küme oluşturmak için kullanılır.
//subSet() methodu, belirtilen aralıkta bulunan elemanlardan oluşan bir sorted set alt kümesi
// oluşturur. Bu nedenle, subSet() yöntemini kullanmak için,
// SortedSet türünden bir değişken oluşturmanız gerekir.

        SortedSet<Character>ss=ts.subSet('a','f');
        System.out.println(ss);


    }}
