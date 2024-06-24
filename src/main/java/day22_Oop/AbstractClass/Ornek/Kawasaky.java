package day22_Oop.AbstractClass.Ornek;

public class Kawasaky extends Motor {


    @Override
    public void tekerKalinligi() {
        System.out.println("Ince Tekerli");
    }

    @Override
    public void yakitTuru() {
        System.out.println("Benzin");
    }

    @Override
    public void engine() {
        System.out.println("1000");
    }

    public void tip (){
        System.out.println("Sport");
    }
}
