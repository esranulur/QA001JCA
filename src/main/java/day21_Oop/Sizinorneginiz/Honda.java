package day21_Oop.Sizinorneginiz;

public class Honda extends Araba{


 {
    String a = "java ";
     System.out.println(a);
 }
    public String motorGucu="150PS";
    public String model="Civic";

    private String ruhsatBilgisi="A10E89C44GFB";

    public String getRuhsatBilgisi() {
        return ruhsatBilgisi;
    }

    public void setRuhsatBilgisi(String ruhsatBilgisi) {
        this.ruhsatBilgisi = ruhsatBilgisi;
    }

    @Override
    public void petrolTuru() {
        super.petrolTuru();
        System.out.println("Honda markasi genellikle benzinli araclar uretilir");
    }
    public Honda (){
        marka = "Honda";

    }
}
