package day10loops;

public class NestedForLoop03 {

    public static void main(String[] args) {

        //Ornek 2: Verilen sayıda ondalık kısımdaki rakamların toplamını bulunuz.
//28.587 ==> 5+8+7=20             ==> Stringe cevirelim cunku split methodu ile ondalık kısmını ayırabiliriz
        double sayi=28.587;
        String sNum=String.valueOf(sayi);
        String decimalPart=sNum.split("[\\.]")[1];
        System.out.println(decimalPart);
//String uzerinde matematiksel islem yapamam bundan dolayı bu kısmı geri int'a cevirmem gerekiyor
        int intDecimalPart =Integer.parseInt(decimalPart);//parseInt() String bir ifadeyi int'e cevirmeyi saglar
//bu bolumu daha once cozmustuk
        int sum=0;
        for (int i = intDecimalPart; i >0 ; i/=10) {
            sum=sum+i%10;
        }
        System.out.println("sum : "+sum);




    }

}
