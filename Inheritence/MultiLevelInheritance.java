package Inheritence;

// Grand Parents...
class A {

    void MethodA() {
        System.out.println("MEthod of A class");
    }
}
// Father...
class B extends A{

    void MethodB() {
        System.out.println("MEthod of B class");
    }
}

// son..
class C extends B{

    void MethodC() {
        System.out.println("MEthod of C class");
    }

}




public class MultiLevelInheritance {
    public static void main(String[] args) {
        C obj = new C();

        obj.MethodC();
        obj.MethodB();
        obj.MethodA();
    }
}
