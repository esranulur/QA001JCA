package day15ArrayListMethodCreation;

import java.util.ArrayList;
import java.util.List;

public class MethodCreation06 {
    public static void main(String[] args) {
        // verilen bir listede tekrar eden sayilari sadece 1 tane yapan
// bir method olusturun
// orn : [1, 3, 5, 3, 5, 6, 1, 7]  bu listi
//       [1, 3, 5, 6, 7] bu hale donusturun


        ArrayList<Integer> myList = new ArrayList<>(List.of());

        myList.add(1);
        myList.add(3);
        myList.add(5);
        myList.add(3);
        myList.add(5);
        myList.add(6);
        myList.add(1);
        myList.add(7);

        System.out.println(myList);
        tekrarsizListOlustur(myList); // tekrarsizList = [1, 3, 5, 6, 7]

    }

    public static void tekrarsizListOlustur(ArrayList<Integer> list) {
        ArrayList<Integer> tekrarsizList = new ArrayList<>();
        for (Integer i : list) {
            if (!tekrarsizList.contains(i)) {
                tekrarsizList.add(i);

            }

        }
        System.out.println("Tekrarsiz List = " + tekrarsizList);
    }


}
