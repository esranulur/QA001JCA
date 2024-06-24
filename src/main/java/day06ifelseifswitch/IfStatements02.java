package day06ifelseifswitch;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
  /*
kullanicidan 2 sayi isteyip sonrasinda yapmak istedigi islemi sectirip kucuk bir hesap makinesi yapin
*/

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen ilk sayiyi giriniz");
        double sayi1= input.nextDouble();
        System.out.println("lutfen ikinci sayiyi giriniz");
        double sayi2=input.nextDouble();
        System.out.println("lutfen yapmak istediginiz islemi secinizi :\n+,*,/,-");//\n ifadesi line anlamına gelir alt satira gecmeyi saglar
        String operator=input.next();

        if (operator.equals("+")){
            System.out.println("Sayilarin toplami : "+(sayi1+sayi2));
        }else if (operator.equals("-")){
            System.out.println("Sayilarin farki : "+(sayi1-sayi2));
        } else if (operator.equals("*")) {
            System.out.println("Sayilarin carpimi : "+String.format("%.2f",sayi1*sayi2));
        } else if (operator.equals("/")) {
            if (sayi2==0){
                System.out.println("lutfen payda'yı 0 yapmaya calısmayın cunku payda 0 olamaz");
            }else {
                System.out.println("Sayilarin bolumu : " + sayi1 / sayi2);
            }
        }else {
            System.out.println("lutfen gecerli bir operator giriniz");

        }}}