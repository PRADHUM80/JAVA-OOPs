// Constructor runs automatically when an object is created.
// Constructor name must be same as class name.
// Constructor does not have a return type (not even void).

// Types::-
// Default Constructor :-
// Has no parameters
// Gives default values

// Parameterized Constructor :-
// Takes parameters
// Used to pass values while creating object

// This keyword in Constructor:-
// this refers to current object
// Used when variable names are same


// Important Points to Remember :-
//  Constructor name = class name
// No return type
// Automatically called
// Used to initialize object
// Can be overloaded (multiple constructors)


//   Constructor       vs  Method          
//  Same name as class | Any name        
//  No return type     | Has return type 
//  Runs automatically | Called manually 
//  Initializes object | Performs task   



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
