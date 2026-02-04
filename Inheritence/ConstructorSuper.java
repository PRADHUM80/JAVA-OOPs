package Inheritence;

class Animal {
    // constructor..
    Animal()
    {
        System.out.println("Animal is Created..");
    }
}

class Dog extends Animal{
    // Constructor
    Dog()
    {
        super();
        System.out.println("Dog is created");
    }
}


public class ConstructorSuper {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
    
}
