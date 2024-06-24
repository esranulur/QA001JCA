package Sorular;

public class C13 {
    public static void main(String[] args) {
        /*
bir dogal sayi arrayi olusturun
ve olusturdugunuz arraydeki tum ogeleri toplayın
 */
        int[] arr = {1, 3, 5, 7, 9};
        int toplam = 0;
        for (int a : arr) {
            toplam += a;//toplam=toplam+a;
        }
        System.out.println(toplam);
    }}