package Polymorphism;

class OverloadingDemo {
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void sum(String a, String b) {
        System.out.println(a + b);
    }
}




public class Main1 {
    public static void main(String[] args) {
      
            OverloadingDemo obj = new OverloadingDemo();
            obj.sum(5, 7);
            obj.sum(5, 6, 7);
            obj.sum("Ram", "Kumar");
    }

}


//  Real Life Example
// Mobile Phone
// Call → normal phone
// Call → smartphone (video call)
// Same action, different behavior ✔


// Key Points (Exam / Interview)
// One interface, many implementations
// Achieved by:
// Method Overloading
// Method Overriding
// Improves code maintainability
// Uses dynamic method dispatch