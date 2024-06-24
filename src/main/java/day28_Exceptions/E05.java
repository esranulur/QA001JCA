package day28_Exceptions;

public class E05 {
    public static void main(String[] args) {

        //try blogundan sonra birden fazla catch bloğu kullanabilir miyiz

        int a =12;
        int b=3;
        String s="My Java";


        getCharFromString(a,b,s);

        }

    private static void getCharFromString(int a, int b, String s) {
        try {
            int idx=a/b;//1) a=12 b=3 iken idx=4 olur ve string'in 4. indexi karsımıza cıkar
            //2) a=12 b=0 iken Arithmetic exception fırlatir cunku payda 0 olur
            //3) a=12 b=1 iken idx 12 olur ve String'in 12. indexi karsımıza cıkar
            System.out.println(s.charAt(idx));//12
        } catch (ArithmeticException e) {
            System.out.println("payda 0 olamaz!!! : "+e.getMessage());
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan indec kullandınız : "+e.getMessage());
        }
    }
}




