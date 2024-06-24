package day33_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {


        //1)Verilen List'teki "maksimum değeri" bulmak için bir method oluşturun

        List<Integer> numb = new ArrayList<>(Arrays.asList(2, 3, 4, 3, 5, 6, 7, 8, 6, 10, 10));

        maksimum1(numb);
        maksimum2(numb);
        maksimum3(numb);
        maksimum4(numb);

    }
    //1.yol

    private static void maksimum1(List<Integer> numb) {//Integer.MIN_Value:bu,int tipinin alabilecegi en kucuk degeri verir(-2^31dir)

        int max = numb.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max);

    }

    //2.yol
    private static void maksimum2(List<Integer> numb) {
        //Integer.MIN_VALUE;yerine
        int max = numb.stream().distinct().reduce(numb.get(0), (t, u) -> t > u ? t : u);
        System.out.println(max);
    }//3.yol

    private static void maksimum3(List<Integer> numb) {
//sorted(): Koleksiyonu belirli bir kritere göre sıralar.(naturel order. kucukten buyuge)

        //int max=numb.stream().distinct().sorted().toList().get(numb.stream().distinct().toList().size()-1);
        int max = numb.stream().distinct().sorted().reduce((t, u) -> u).get();
        System.out.println(max);
    }

    //4.yol
    private static void maksimum4(List<Integer> numb) {
        //Java'da :: işareti, "Method Reference" olarak adlandırılır.
        // Bir metodun doğrudan referansını alarak lambda ifadeleri yazmadan kullanmanızı sağlar.
        Integer max=numb.stream().distinct().reduce(Math :: max).get();
        System.out.println(max);
    }



}