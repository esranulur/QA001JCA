package day25_Konu.ornek;

public class BankaSirasi {

    static long siraNo=100;
    long sira;
    String name;

    @Override
    public String toString() {
        return "BankaSirasi{" +
                "sira=" + sira +
                ", name='" + name + '\'' +
                '}';
    }

    public BankaSirasi(String name) {
        this.name = name;
        this.sira = siraNo;
        siraNo++;




    }
}
