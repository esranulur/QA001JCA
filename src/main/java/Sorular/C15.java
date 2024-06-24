package Sorular;

import java.util.Arrays;
import java.util.Random;

public class C15 {
    public static void main(String[] args) {
        /*
icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir array olusturun
 */


        int []array=new int[200];
        Random rnd=new Random();//random yani rastgele sayi uretmeyi saglar

        for (int i = 0; i <200 ; i++) {
            int sayi=rnd.nextInt(1001);
            array[i]=sayi;
        }
        System.out.println(Arrays.toString(array));

        }
    }
