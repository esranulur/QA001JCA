package day21_Oop.Odev;

public class Komsu1 extends Daire{

public String name="Hans Peter";
public String wifiname="HP3";
private String wifiSifresi="Hans3";

    public String getWifiSifresi() {
        return wifiSifresi;
    }

    private void setWifiname(String wifiname) {
        this.wifiname = wifiname;
    }

    @Override
    public int getDaireNo() {
        return daireNo;
    }
}
