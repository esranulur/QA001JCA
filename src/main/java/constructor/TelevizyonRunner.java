package constructor;

public class TelevizyonRunner {
    public static void main(String[] args) {
        Televizyon televizyon1=new Televizyon();
        televizyon1.marka="Samsung";
        televizyon1.model="S1";
        televizyon1.boyut="75 inç";
        televizyon1.kalitesi="4k ulrta hd";
        televizyon1.fiyat=2500;
        televizyon1.interneteBagliMi=false;
        televizyon1.on();
        System.out.println("--------------------");
        //televizyon1.interneteBagliMi=televizyon1.interneteBagla();//true
        System.out.println("-------------------------");
        televizyon1.uygulamaYukle(televizyon1.interneteBagliMi);
        System.out.println("---------------------------");
        televizyon1.off();
        Televizyon televizyon2=new Televizyon("Philips","P01","65 inc","Full hd",1200,false);
        televizyon2.on();
        televizyon2.uygulamaYukle(televizyon2.interneteBagliMi);
        televizyon2.off();

        //Televizyon televizyon3=new Televizyon("Lg","L01" ,"55inc")

    }
}
