package day12Arrays;

public class Arrays05 {
    public static void main(String[] args) {


        //Ornek 1: int turunde ages isminde bir Array olusturunuz, icine 6 tane eleman yerlestiriniz,
//bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz
//[17,27,19,15,21,24];
        int[] arr={17,27,19,15,21,24};
//1. ve basit yol
//System.out.println(Arrays.toString(arr));
//Arrays.sort(arr);
//System.out.println(Arrays.toString(arr));
//System.out.println("minimum deger : "+arr[0]);
//System.out.println("maximum deger : "+arr[arr.length-1]);
//--------------------------------
//2. ve algoritmik yol
//17,27,19,15,21,24
        int min=arr[0];
        int max=arr[0];
        for (int sayi:arr){

            if (sayi<min){
                min=sayi;
            }
            if (sayi>max){
                max=sayi;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }}
