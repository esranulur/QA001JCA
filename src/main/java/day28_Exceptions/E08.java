package day28_Exceptions;

public class E08 {
    public static void main(String[] args) {



//7 Null deger 0 girdiginde NullPointerException fırlatan bir method olusturunuz

    int a = 0;
    String b = null;

    //printValue(a);
    printValue(b);

}


public static void printValue(int value) {
    if (value != 0) {
        System.out.println(value);
    } else {
        throw new NullPointerException(" 0 deger giremezsiniz !");
    }
}

public static void printValue(String value) {
    if (value != null) {
        System.out.println(value);
    } else {
        throw new NullPointerException("Null deger giremezsiniz !");
    }
}
}