package day12Arrays;

public class Arrays04 {

    public static void main(String[] args) {



//Ornek 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
//icerdigi karakter sayilari toplamini ekrana yazdirin.
//[Bayburt,Sivas,Adana,Antalya,Izmir];
        String [] cities=new String[5];

        cities[0]="Bayburt";
        cities[1]="Sivas";
        cities[2]="Adana";
        cities[3]="Antalya";
        cities[4]="Izmir";

//1. yol : for loop
        int toplam=0;
        for (int i = 0; i <=4 ; i++) {
            toplam+=cities[i].length();//toplam=toplam+cities[i].length();
        }
        System.out.println(toplam);

//eger indexlerle bir isimiz var ise biz forloop kullanırız fakat indexlerle degil sadece elemanlar ile isimiz varsa foreach loop kullanırız

        int sum=0;
        for (String str:cities){
            sum+=str.length();
        }
        System.out.println(sum);



}}
