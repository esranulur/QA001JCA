package day30_exception;

import java.util.Scanner;

public class C01_EXCEPTION {
    public static void main(String[] args) {

      /*kullanicinin girdigi site linkinde virus varmi diye kontrol saglayin virus varsa exception firlatin*/
Scanner input =new Scanner(System.in);
        System.out.println("Lutfen kontrol etmek istediginiz site linkini giriniz");
        String link= input.nextLine();
        boolean virussuzMu=link.contains("www.")&&link.contains("com");
if (virussuzMu){
    System.out.println(link);
}else{

        throw new VirusException ("Bu site virus icerebilir, tiklamadan once lutfen bi daha dusunun!");

    }
}}
