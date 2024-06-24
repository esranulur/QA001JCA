package day22_Oop.interfaceClass;

public class AudiRnner {
    public static void main(String[] args) {
        AudiA4 a4 = new AudiA4();

        a4.esp();
        a4.analog();
        a4.turbo();
        ((Fren)a4).run();
        System.out.println(AudiA4.fiyat);

        AudiS5 S5 = new AudiS5();
        S5.abs();
        ((Motor)S5).run();
        System.out.println(AudiS5.fiyat);

        System.out.println(S5.fiyat);

    }
}
