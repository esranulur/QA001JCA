package day13arrayArrayList;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {


//Ornek 2: Spesifik bir elemanin Array'de olup olmadigini anlamak icin gereken kodu yaziniz
        String [] arr={"a","b","z","f","g","e","i"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, "b"));//1
        System.out.println(Arrays.binarySearch(arr, "h"));//-3 eger negatif bir sayi veriyorsa o zmn o deger arrayimin icinde yoktur

        int [] array={2,1,7,6};
        //2,7,3,9;

        String [] arrays={"2,1 ,7,6"};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(array, 2));
        System.out.println(Arrays.binarySearch(array, 7));
        System.out.println(Arrays.binarySearch(array, 3));
        System.out.println(Arrays.binarySearch(array, 9));

    }}
