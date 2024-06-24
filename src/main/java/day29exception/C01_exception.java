package day29exception;

import java.util.InputMismatchException;

public class C01_exception {
    public static void main(String[] args) {



        //bir kutuphaneye nasil exception eklenir
        //biz nasil exception firlatiyor idik
        //throw new

        printAge(5);
        printAge(-3);

    }

    private static void printAge(int i) {

    if (i>0){
        System.out.println(i);
    }else {
        throw new Jobcenter("yas degeri negatif olamaz");
    }


    }
}
