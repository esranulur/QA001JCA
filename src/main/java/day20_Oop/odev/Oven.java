package day20_Oop.odev;

public class Oven extends Elektronik {

public Oven(){
    this("S24");
    System.out.println("S24");
}

public Oven(String tip){
    super("Siemens ",2014);

    System.out.println(tip);
}
}
