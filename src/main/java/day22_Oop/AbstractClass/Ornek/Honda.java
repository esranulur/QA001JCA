package day22_Oop.AbstractClass.Ornek;

public class Honda extends Araba{




    public void kasaTuru() {
        System.out.println("Hatchback");

    }

    @Override
    public void yakitTuru() {

        System.out.println("Benzin");

    }

    @Override
    public void engine() {
        System.out.println("2.0 Turbo");

    }

    public void model(){
        System.out.println("Civic");
    }
}
