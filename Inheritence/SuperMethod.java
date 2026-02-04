package Inheritence;

class Animal{
    void eat() {
        System.out.println("Eating..");
    }
}

class Dog extends Animal{
    void eat() {
        System.out.println("Eating ....");
    }

    void bark() {
        System.out.println("Barking...");
    }

    void work() {
        super.eat(); // Parent class...
        bark();
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.work();
    }
}
