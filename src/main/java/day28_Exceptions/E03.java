package day28_Exceptions;

public class E03 {
    public static void main(String[] args) {

        //3) StringIndexOutOfBoundsException, bir String nesnesinin karakter dizisindeki
//geçersiz bir indekse erişmeye çalışıldığında ortaya çıkan bir istisna türüdür.


        String s = "Java";

        karakterSec(s,7);
        System.out.println(s.charAt(2));//v


        //System.out.println(s.charAt(7));

        System.out.println(s.charAt(2)); // v

        karakterSec(s, 5);
        karakterSec(s, 0);

        System.out.println("1.Kodlarimiz  calismaya devam ediyormu...");

        karakterSec(s, 7);

        System.out.println("2.Kodlarimiz  calismaya devam ediyormu...");

    }




        public static void karakterSec(String s,int idx){
            try{
                System.out.println(s.charAt(idx));//StringIndexOutOfBoundsException
            }catch (Exception e){
                System.out.println("olmayan indexleri kullanmayiniz : "+e.getMessage());
//olmayan indexleri kullanmayiniz : String index out of range: 7
                e.printStackTrace();//StringIndexOutOfBoundsException exception'i gorduk ve calismaya devam ediyor cunku printstacktrace methodu exception fırlatmaz sadece gosterir

            }
        }
    }
