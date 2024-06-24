package day29exception;

import java.util.Scanner;

import static Proje.LoginPageApp.UserService.input;

public class C03_exception {
    public static void main(String[] args) {

        String str="Java bugun cok eglenceli";
        /*Kullanicidan bir harf aliniz ve aldiginiz harfin indexini dondurunuz
        not :bu durumda olusabilcek exceptionlari try catch ile kontrol altina aliniz
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir harf giriniz: ");
        String harf = input.next();
        try {
            if (str.contains(harf)){
                System.out.println(str.substring(0,str.indexOf(harf)));
            }else {
                throw new ContainsCharacterException("icermeyen bir harf girdiniz");
            }
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("1. catch lutfen cumlenin icinde bulunan bir harf giriniz");
        }catch (ContainsCharacterException e){
            System.out.println("2. catch lutfen cumlenin icinde bulunan bir harf giriniz");
        }}}