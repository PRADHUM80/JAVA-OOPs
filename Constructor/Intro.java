package Constructor;

class Student
{
    String name;
    int id;
    int age;

    // constructor.. Class nme is sme as a MEthod name...
    Student(String name, int id, int age)
    {

        // this is key word...  current object’s variable, not the local variable
      this.name = name;
      this.id = id;
      this.age = age;
      System.out.println("Hello World!");
    }

}

public class Intro {
    
    public static void main(String[] args) {
        // passing the value in parameters..
        Student s = new Student("Ram", 01, 21);
    }
}
