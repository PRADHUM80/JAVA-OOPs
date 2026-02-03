package Inheritence;

class ParentClass{
    void display()
    {
        System.out.println("Parent Class Method");
    }
}

class childClass extends ParentClass
{
     void show()
     {
        System.out.println("Child Class Methods");
     }
}



public class inheritance {
    public static void main(String[] args) {
        childClass child1 = new childClass();
        child1.display();
        System.out.println();
        child1.show();
    }
}
