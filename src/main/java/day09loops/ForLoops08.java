package day09loops;

public class ForLoops08 {

    public static void main(String[] args) {

        //Ornek 2: Bir String'teki tekrarsiz karakterleri veren kodu yaziniz
            // Yusuf ==> Ysf
        String t="Yusuf";

        for (int i = 0; i <t.length() ; i++) {
            char ch=t.charAt(i);

            if (t.indexOf(ch)==t.lastIndexOf(ch)){
                System.out.print(ch);
            }
        }




    }

}
