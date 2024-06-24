package day20_Oop.polymorphism;

public class Cat extends Mammal {

    public void meow(){
        System.out.println("Cats Meow....");
    }

    @Override
    public void feedWithMilk() {
        System.out.println("Cats feed their babies with milk");
    }
}