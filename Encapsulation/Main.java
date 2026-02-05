package Encapsulation;
// Data items are Binding, and hide the data Member , access the data
// by using Get and Set() methods...
// Secure.


class Student {
    private String name;
    private int age;
    private int roll_no;


    // Getters Methods :--
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRoll_no() {
        return roll_no;
    }



    // Setters Methods...


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

}

public class Main {

    public static void main(String[] args) {
        Student obj = new Student();
        // Set the Value..
        obj.setName("Rahul");
        obj.setAge(21);
        obj.setRoll_no(01);
        // Show the Value..
        obj.getName();
        obj.getAge();
        obj.getRoll_no();
    }
    
}
