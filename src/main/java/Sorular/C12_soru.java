package Sorular;

import java.util.Arrays;

public class C12_soru {
    public static void main(String[] args) {
        // 2.soru bir array olusturun ve olusturdugunuz arraydeki sayilari kucukten buyuge siralayin

        int[] arr = {4, 5, 2, 3, 99, 87, 65, 42, 56, 77};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //3.soru Verilen arrayin tum elemanlarini bir soldaki konuma tasiyacak
        //bir program yazin. Ornek; array ((1,2,3)) ise output (2, 3, 1) olacak

        String[] arr1 = {"a", "b", "c", "d", "f"};
        String ilkIndex = arr1[0];
        for (int i = 0; i < arr1.length - 1; i++) {
            arr1[i] = arr1[i + 1];
        }
        arr1[arr1.length - 1] = ilkIndex;
        System.out.println(Arrays.toString(arr1));


    }
}















