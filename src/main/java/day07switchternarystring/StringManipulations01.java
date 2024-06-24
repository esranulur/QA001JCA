package day07switchternarystring;

public class StringManipulations01 {

    public static void main(String[] args) {
        //Ornek 1: "s" String'inde kullanilan karakter sayisini bulunuz.

        String s="Java is easy";
        System.out.println(s.length());//12
//lenght() : methodu String'in uzunlugunu almayi saglar

//Ornek 2: "s" String'inde ilk ve son index'teki karakterleri aliniz.
        char firstChar=s.charAt(0);
        System.out.println(firstChar);

        char lastChar=s.charAt(s.length()-1);//11
        System.out.println(lastChar);
//charAt() : methodu String'deki belirli indexten karakter almayi saglar
    }

}
