package day07switchternarystring;

public class Ternary01 {
    public static void main(String[] args) {


        //Ornek 1: Verilen yilin "Leap Year" olup olmadigini kontrol eden kodu yaziniz.





//2024
//1996
//1904
//bunlar 100'e bolunemeyenler eger yilimiz 100'e bolunemiyorsa 4'e tam bolunmelidir
//1900
//1600
//1500
//bunlar 100'e bolunebiliyor eger yilimiz 100'e bolunebiliyorsa 400'e tam bolunmelidir

        int year = 1500;
        String result = (year % 100 == 0) ?
                (year % 400 == 0 ? year + " : Leap Year" : year + " leap year degil") :
                (year % 4 == 0 ? year + " : Leap Year" : year + " leap year degil");
        System.out.println(result);







    }


}
