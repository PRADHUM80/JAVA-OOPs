package AccessModifiers;
                    // Samecls        samePAckage Subclass          smePackage NONSUB CLASS        DifferentPkg SUBCLASS          DiffPACKAGENON-SubCLAss
// Pbulic :-           yes                   yes                              yes                         yes                          yes
// Private:-            yes                  NO                                NO                          NO                           NO
// Protect:-             YES                 YES                               YES                         YES                          NO   
// Default:-              YES                 YES                              YES                           NO                         NO

class Student{
    String name;
    // private int age;
    protected int roll_no;


    void print() {
        System.out.println(name);
        // System.out.println(age);
        System.out.println(roll_no);
    }
}


public class Main {
    public static void main(String[] args) {
        
        Student student1 = new Student();
        student1.name = "Rahul";
        // student1.age = 21;
        student1.roll_no = 1;
        student1.print();
    }
}
