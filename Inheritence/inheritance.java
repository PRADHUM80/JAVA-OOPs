package Inheritence;

class ParentClass{
    void display()
    {
        System.out.println("Parent Class Method");
    }
}

class ChildClass extends ParentClass
{
     void show()
     {
        System.out.println("Child Class Methods");
     }
}



public class inheritance {
    public static void main(String[] args) {
        ChildClass child1 = new ChildClass();
        child1.display();
        System.out.println();
        child1.show();
    }
}
