package Scanner01;

import java.util.Scanner;

public class Scanner03  {

    public static void main(String []args){
        //Ornek 3: Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz.
        //Example 3: Write the code that takes two numbers from the user, performs 4 operations and displays the results of the operations on the screen.
        //
         Scanner input = new Scanner(System.in)  ;

         System.out.println("lutfen 2 tane sayi giriniz");
         double firstNumber = input.nextDouble();
         double secoundNumber= input.nextDouble();
         System.out.println("sum :"+(firstNumber+secoundNumber)); // toplami
        System.out.println("subtraction : "+firstNumber+secoundNumber);
        System.out.println("Multiplication"+firstNumber*secoundNumber);//carpimlari
        System.out.println("Division"+firstNumber/ secoundNumber);//bolme
//Not carpma ve bolme işlemi icin parantez kullanmadım cunku bunlar zaten + işleminden once gelir

        System.out.println("Division : "+String.format("%.2f",firstNumber/secoundNumber));
// kendime not ondalik sayilar icin virgulden sonrasini kontrol etmek icin kullanilir




    }



}
