package day34_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {


                List<String> mylist=new ArrayList<>();
                mylist.add("Ali");
                mylist.add("Elif");
                mylist.add("ElifX");
                mylist.add("Yusuf");
                mylist.add("YusufX");
                mylist.add("Arda");
                mylist.add("NiyaziX");
                mylist.add("Esra");
                mylist.add("HasanX");
                mylist.add("Hüseyin");

                // mylist.stream().
                //         distinct().
                //         map(String::toLowerCase).
                //         sorted(Comparator.comparing(String::length)).
                //         forEach(Utils::printInTheSameLineWithSpace);
                // List<Integer> myList1= new ArrayList<>(Arrays.asList(2, 3, -17, 55, 3, 5, 6, 7, 8, 10, -10, 11, 14));
                // myList1.stream().distinct().sorted().forEach(Utils::printInTheSameLineWithSpace);
                //removeIflengthGreaterThanFive(mylist);
                //removeIfStartWithZorEndsWithf(mylist);
                //removeIfStartWithZorEndsWithf2(mylist);
                System.out.println(mylist);
                removeIfContainsX(mylist);

            }
            //1) Karakter sayisi 5'ten fazla olan elemanları silen bir method oluşturun.
            public static void removeIflengthGreaterThanFive(List<String>myList){
                //removeIf() metodu, koleksiyonlardaki (özellikle List, Set gibi) elemanları belirli bir koşula göre
// kaldırmak için kullanılır.removeIf metodu Collection arayüzünde tanımlıdır,
// stream kullanilmadan cagirilir
                myList.removeIf(t->t.length()>5);
                System.out.println(myList);
            }

            //2 ) ‘Z’ ile başlayan yada ‘f’ ile biten elemanları silen bir method oluşturun.
            //1. yol
            public static void removeIfStartWithZorEndsWithf(List<String>list){
                list.removeIf(t->t.charAt(0)=='Z'||t.charAt(t.length()-1)=='f');
                System.out.println(list);
            }
            //2. yol
            public static void removeIfStartWithZorEndsWithf2(List<String> list){
                //2 ) 'Z' ile başlayan yada 'f' ile biten elemanları silen bir method oluşturun.
                list.removeIf(t->t.startsWith("Z")||t.endsWith("f"));
                System.out.println(list);
            }
            //3 ) "X" karakteri iceren elemanları silen bir method oluşturun.
            public static void removeIfContainsX(List<String>list){
                list.removeIf(t->t.contains("X"));
                System.out.println(list);
            }
        }