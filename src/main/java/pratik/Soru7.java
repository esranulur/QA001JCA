package pratik;

public class Soru7 {
    public static void main(String[] args) {


        //Bir String' de tekrarlanan karakterleri yazdırmak için kod yazınız.
//Örnegin; accessories ´ ces


        String c = "accessories";
        String a = "";


        for (int i = 0; i < c.length(); i++) {
            String b = c.substring(i, i + 1);

            if (c.indexOf(b) != c.lastIndexOf(b)){
                if (!a.contains(b)) {
                    a = a + b;
                }


            }
        } System.out.println(a);
    }
}



