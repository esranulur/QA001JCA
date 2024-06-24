package day06ifelseifswitch;


import java.util.Scanner;

public class Switch03{
    public static void main(String[] args) {
        // Kullanicidan kacinci ay
        // oldugunu alip mevsimi yazdiran bir
        // switch olusturun


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen kacinci ay oldugunu giriniz");
        byte monthNum = input.nextByte();




        // Kullanicidan kacinci ay
// oldugunu alip mevsimi yazdiran bir
// switch olusturun

        System.out.println("lutfen kacıncı ay oldugunu giriniz");
        byte ayNo = input.nextByte();
        switch (ayNo) {
            case 12, 1, 2:
                System.out.println("Kış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ilk bahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Son Bahar");
                break;
            default:
                System.out.println("lutfen gecerli bir ay numarasini giriniz");
        }


    }

}
