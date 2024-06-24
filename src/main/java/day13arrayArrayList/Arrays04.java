package day13arrayArrayList;

public class Arrays04 {
    public static void main(String[] args) {



        String [][] students= {{"Ali","Kemal"}, {"Cemal"}, {"Ayhan","Beyhan","Seyhan"}, {"Ceyhan","Burdan"}};
//Ornek 1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.
        int sum=0;

        for (String []w:students){
            sum+=w.length;
        }
        System.out.println("sum = " + sum);

        System.out.println("-------------------------------");
//Ornek 2: Yukaridaki students Array'inde icinde "m" olan isimleri console'a yazdiriniz
        for (String []w : students){
            for (String e:w){
                if (e.contains("m")){
                    System.out.println(e);
                }
            }
        }
    }}

