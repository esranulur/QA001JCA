package day06ifelseifswitch;

public class Ternary02 {

    public static void main(String[] args) {

        //eger sayi negatif bir sayi ise -1 ile carpariz
//eger sayi pozitifse herhangi bir islem yapmamıza gerek yok


        //Ornek 2: Iki sayinin isareti ayni ise bu sayilari carpan, isaretleri farkli ise
        // "Farkli isaretli sayilari carpamiyorum" mesaji veren kodu yaziniz.
        int a=4;
        int b=7;
        //a*b iki degerde pozitif ise pozitif verir iki degerde negatif ise pozitif
        //condition           ? true(code1): false(code2)
        Object result=(a>0&&b>0)||(a<0&&b<0)?a*b         : "farkli isaretli sayilari carpamiyorum";
        System.out.println(result);
//object Javada butun non-primitive data typelarin (class) ortak parent idir.

    }

}
