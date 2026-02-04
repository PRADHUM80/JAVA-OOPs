package Inheritence;
// To invoke PARENT CLASS VARIABLE...

class Animal {
    String color = "white";
}

class Dog extends Animal{
    String color = "black";

    void printColor() {
        System.out.println(color); // prints color of Child Class
        System.out.println(super.color); // use super keywords ... prints color of Parents Class
    }
}

public class TestSuperkey {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
    }
}
