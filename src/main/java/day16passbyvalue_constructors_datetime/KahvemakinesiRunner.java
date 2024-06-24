package day16passbyvalue_constructors_datetime;

public class KahvemakinesiRunner {
    public static void main(String[] args) {


        KahveMakinesi kahveMakinesi1 = new KahveMakinesi();

        System.out.println(kahveMakinesi1);
        kahveMakinesi1.on();
        kahveMakinesi1.kahveOgutme();
        kahveMakinesi1.off();


    }
}
