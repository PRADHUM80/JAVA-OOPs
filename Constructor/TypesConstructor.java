package Constructor;

class Student
{
    String name;
    int id;
    int age;

    // constructor.. Class nme is sme as a MEthod name...
    Student()
    {
      System.out.println("Default Constructor");
    }

    Student(String name, int id, int age)
    {
        // this is key word...  current object’s variable, not the local variable
      this.name = name;
      this.id = id;
      this.age = age;
      System.out.println("Parameterized Constructor");
    }
}


public class TypesConstructor {
    public static void main(String[] args) {
      
      Student s = new Student();
    }
}
