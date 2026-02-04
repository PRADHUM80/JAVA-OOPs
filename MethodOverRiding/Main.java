package MethodOverRiding;

// Real Life Example
//  Bank Interest
// Parent: getInterest()
// Child: SBI, HDFC different interest logic

//  Parent Class Ke Method KO Child Class Mein Fir se Likhna.

// Method Name Same
// Parameter Same
// Inheritence Required
// Retrun type Same
// Access Modifier Not Weak
// Static , final, Private, MEthod Override Nhe Hote Hain..

class Bank {
    public void RateOfInterest() {
        System.out.println("Generally rate of interest is 5%");
    }
}

class SBI extends Bank {
    @Override
    public void RateOfInterest() {
        System.out.println("Rate of Interest for SBI is 6.5%");
    }
}

class PNB extends Bank {
    @Override
    public void RateOfInterest() {
        System.out.println("Rate of Interest for PNB is 6%");
    }
}

 public class Main {

    public static void main(String[] args) {
        Bank obj1 = new Bank();
        SBI obj2 = new SBI();
        PNB obj3 = new PNB();

        obj1.RateOfInterest();
        obj2.RateOfInterest();
        obj3.RateOfInterest();
    }
    
}
