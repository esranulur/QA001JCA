package day10loops;

public class NestedForLoop05 {

    public static void main(String[] args) {


        /*
    a
    a b
    a b c
    a b c d
    a b c d e
    şeklini yazdırınız.
    */


        for (int i = 'a'; i <='e' ; i++) {
            for (int j = 'a'; j <=i ; j++) {
                System.out.print((char) j+" ");
            }
            System.out.println();
        }

    }


}
