package day07switchternarystring;

public class StringManipulations02 {
    public static void main(String[] args) {


        String s="Java is easy";
        String sub1=s.substring(0, 4);
        System.out.println(sub1);//Java


        //Ornek 4: "s" String'indeki "is" kelimesini aliniz.

        String sub2 = s.substring(5,7);
        System.out.println(sub2);


        //Ornek 5: "s" String'indeki “easy" kelimesini aliniz

        String sub3 = s.substring(8,12);
        System.out.println(sub3); // easy




    }

}
