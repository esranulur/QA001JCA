package day21_Oop.Odev;

public abstract class Daire extends Apartment{

public int daireNo= 3;
public  String WifiSifresi="";
public abstract int getDaireNo();

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
