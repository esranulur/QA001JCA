package day10loops;

public class NestedForLoop07 {

    public static void main(String[] args) {
        /*


             *
            * *
           *****
          *     *
         *       *

         */

        int topSatir=5;

        for (int bulSatir = 1; bulSatir <=topSatir ; bulSatir++) {

            for (int bosluk = 4; bosluk >=bulSatir ; bosluk--) {
                System.out.print(" ");

            }

            for (int yildiz = 1; yildiz <=2*bulSatir-1 ; yildiz++) {
                //if (bulSatir==3||yildiz==1||yildiz==2*bulSatir-1){
                //    System.out.print("*");
                //}else{
                //    System.out.print(" ");
                //}
                System.out.print("*");
            }
            System.out.println();

        }


    }

}
