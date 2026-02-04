package Inheritence;

class A {
    public void print() {
        System.out.println("Class A Method");
    }
}

class B extends A {
    public void printB() {
        System.out.println("Class B Method");
    }
}

class C extends A {
    public void printC() {
        System.out.println("Class  C Method");
    }
}

public class hierarchicalinheritance {
    public static void main(String[] args) {
        B obj = new B(); 
        obj.print();

        C obj1 = new C();
        obj1.printC();
    }
}
