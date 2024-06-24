package day28_Exceptions;

public class E07 {
    public static void main(String[] args) {



        //IllegalArgumentException, bir metodun geçersiz bir argüman aldıgında oluşan bir hata türüdür.

//Girdigimiz yasi konsola yazdiran bir method olusturalim



printAge(25);
printAge(-3);//yas degeri eksi olamaz burda bizim  bir hata mesaji vermemiz gerekmektedir.
        System.out.println("calismyaya devam eder mi");//etmez

    }private static void printAge(int age) {
        if (age >= 0) {
            System.out.println(age);


        } else {
            throw new IllegalArgumentException("yasi neden negatif girdin!!");

        }
    }}