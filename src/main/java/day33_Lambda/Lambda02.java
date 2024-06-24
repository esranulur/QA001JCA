package day33_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {


        //7)Verilen List'teki "minimum değeri" bulmak için bir method oluşturun

        List<Integer> numb = new ArrayList<>(Arrays.asList(2, 3, 4, 3, 5, 6, 7, 8, 6, 10, 10));

        minumum1(numb);
        minumum2(numb);
        minumum3(numb);
        minumum4(numb);

    }
    //1.yol

    private static void minumum1(List<Integer> numb) {

        int min = numb.stream().distinct().reduce(Integer.MAX_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(min);

    }

    //2.yol
    private static void minumum2(List<Integer> numb) {

        int min = numb.stream().distinct().reduce(numb.get(0), (t, u) -> t > u ? t : u);
        System.out.println(min);
    }//3.yol

    private static void minumum3(List<Integer> numb) {

        int min = numb.stream().distinct().sorted().reduce((t, u) -> u).get();
        System.out.println(min);
    }

    //4.yol
    private static void minumum4(List<Integer> numb) {

        Integer min=numb.stream().distinct().reduce(Math :: min).get();
        System.out.println(min);

    }}
////3. yol
//    public static void minimum3(List<Integer>numb){
//        //sorted(Comparator.reverseOrder()) ifadesi,
//// Java Stream API'si içinde bir koleksiyonu ters sıralamak için kullanılır.
////Comparator class, reverseOrder() methoddur.
//        int min= numb.stream().distinct().sorted(Comparator.reverseOrder()).reduce((t, u)->u).get();
//        System.out.println(min);
//    }