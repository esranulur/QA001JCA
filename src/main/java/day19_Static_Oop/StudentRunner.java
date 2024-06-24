package day19_Static_Oop;

public class StudentRunner {
    public static void main(String[] args) {
        Student student0=new Student();
        student0.name="Veli Can";

        //1000//157
        //System.out.println(student.name);//Veli Can
        System.out.println(student0.ogrenciNo);//1000

        Student student1=new Student();
        //System.out.println(student1.name);//Ali Can
        System.out.println(student0.sayac);//1002//157
        System.out.println(student1.sayac);
        System.out.println(student1.ogrenciNo);//1001
        System.out.println();
    }
}
