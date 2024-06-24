package day25_Konu.ornek;

public class Bankamatik {

String name;
int hesapbilgileri;

    public Bankamatik(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bankamatik{" +
                "name='" + name + '\'' +
                ", hesapbilgileri=" + hesapbilgileri +
                '}';



    }
}
