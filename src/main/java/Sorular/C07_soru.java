package Sorular;

import java.util.Scanner;

public class C07_soru {

    public static void main(String[] args) {
        

    /*Soru 7) Interview Question Kullanicidan 100'den kucuk bir tamsayi isteyin.
    1'den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
    - Sayi 3'un kati ise sayi yerine "Java" yazdirin.
    - Sayi 5'in kati ise sayi yerine "Guzeldir" yazdirin.
    - Sayi hem 3'un hem 5'in kati ise sayi yerine "Java Guzeldir"yazdirin.
*/


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen 100'den kucuk bir tam sayi giriniz");
        int sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("Java Guzeldir. ");
            } else if (i % 5 == 0) {
                System.out.print("Guzeldir ");
            } else if (i % 3 == 0) {
                System.out.print("Java ");
            } else {
                System.out.print(i + " ");
            }
        }

    }


}

