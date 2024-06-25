package day35_Lambda;

import day34_Lambda.Utils;

import java.util.stream.IntStream;

public class Lambda01 {
//4) Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz
// baslangic ve bitis dahil degil
//

    public static void main(String[] args) {
        System.out.println(getSumsofBetweenTwoInteger(12, 5));


    }
    public static int getSumsofBetweenTwoInteger(int a ,int b){
if (a>b){
    int c =a;
    a=b;
    b=c;
//            a=a+b;
//            b=a-b;    Swap
//            a=a-b;
}
        //return IntStream.range(a+1,b).filter(Utils::isNumberEven).reduce(Math::addExact).getAsInt();
        return IntStream.range(a + 1, b).filter(Utils::isNumberEven).sum();

}}