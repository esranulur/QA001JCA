package Odevler;

public class Deneme {
    public static void main(String[] args) {


        String str="Ali can javayi ogreniyor";
        System.out.println(str.replace("a","!"));
        System.out.println(str);


        StringBuilder stringBuilder =new StringBuilder();
        stringBuilder.append("Ali can javayi ogreniyor");
stringBuilder.replace(1,5,"Veli");
        System.out.println(stringBuilder);
        stringBuilder.reverse();
    }}
