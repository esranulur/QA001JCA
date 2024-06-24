package day04increment_decrement_if;

public class IfStatements01



{
    public static void main(String[] args) {

//cok calisirsan basarili olursun
//(kosul:       )(sonuc:         )
        int sayi1=5;
        int sayi2=7;
        if(sayi1>sayi2){//false olursa calismaz
            System.out.println("condition dogru oldugu icin if calisti");
        }

        if (7==4+3){//true olursa calisir
            System.out.println("condition dogru if calisti");
        }

        //Ornek 1: Sayi 0 (dahil) ile 10 (haric) arasinda ise ekrana "Rakam" yazdirin.


        int num=-7;

        if (num>=0&&num<10){
            System.out.println("Rakam");



        }
//Ornek 2: Sayi uc basamakli ise ekrana "Sayi üç basamaklidir" yazdirin.




        int num1=1001;
        if (num1>99&&num1<1000){
            System.out.println("Sayi üç basamaklidir");
        }




    }
}
