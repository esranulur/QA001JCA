package day20_Oop.polymorphism;

public class Dog extends Mammal {
    public void bark(){
        System.out.println("Dogs bark...");
    }
    public void eat() {
        System.out.println("Dogs eat meat...");
    }
}