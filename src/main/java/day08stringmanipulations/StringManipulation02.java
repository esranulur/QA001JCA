package day08stringmanipulations;

public class StringManipulation02  {

    public static void main(String[] args) {
        //String str="Java bugun cok guzel";
//System.out.println(str.split(" ")[0]);
//System.out.println(str.split(" ")[1]);
//System.out.println(str.split(" ")[2]);
//System.out.println(str.split(" ")[3]);
//str=str.split(" ")[0];
//System.out.println("str : "+str);


//Ornek 1: Bir String'in belirli bir karakterinden baslayarak belirli bir karaktere kadar
// tum karakterleri dynamic olarak aliniz. abc@gmail.com ===> gmail


        String mail = "abc@gmail.com";//abcd@gmail.com

//1.yol : hard coding tavsiye edilmez
        System.out.println(mail.substring(4, 9));

//2.yol dynamic
        String company1 = mail.split("@")[1].split("\\.")[0];
        System.out.println(company1);

//3. yol dynamic
        int startingIndex = mail.indexOf("@") + 1;//4
        int endingIndex = mail.indexOf(".");
        System.out.println(endingIndex);
        System.out.println(mail.substring(startingIndex, endingIndex));

    }}