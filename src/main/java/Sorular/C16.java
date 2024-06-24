package Sorular;

import java.util.Arrays;

public class C16 {
    public static void main(String[] args) {
        //soru-Verilen bir array'e yeni bir element ekleyin
        int []arr={1,2,3,4,5,6,7,8};//9
        int []yeniArr=new int[arr.length+1];

        for (int i = 0; i <arr.length ; i++) {
            yeniArr[i]=arr[i];
        }
        System.out.println(Arrays.toString(yeniArr));
        yeniArr[yeniArr.length-1]=9;
        System.out.println(Arrays.toString(yeniArr));
    }}
