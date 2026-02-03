
// One Parent class and One Child Class
// is a relationship..
// car has a engine..
// car is a Vehicle...



package Inheritence;
class employee {

    void salary() {
        System.out.println("Salary = 70000" );
    }
}
class hr extends employee{

    void bonous() {
        System.out.println("Bonous = 20000");
    }
}
public class SingleInheritence {
    public static void main(String[] args) {
        hr obj = new hr();
        obj.salary();
        System.out.println();
        obj.bonous();
    }
}
