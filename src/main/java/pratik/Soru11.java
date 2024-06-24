package pratik;

public class Soru11 {
    public static void main(String[] args) {

        //String içindeki tüm küçük harfleri yıldız isaretiyle yazdırmak için gereken kodu yazınız. Örnegin; 'Ali Can?' ==> l*i*a*n*

   String a= "Ali Can";
   String b= a.replaceAll  ("[^a-z]","");
   String t="";

        System.out.println(b);

        for (int i = 0; i <b.length(); i++) {
            String r=b.substring(i,i+1);
            t=t+r+"*";

        }
        System.out.println(t);

    }}
