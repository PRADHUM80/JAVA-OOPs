package Polymorphism;
// Overrider...

class Bank {
    void interest() {
        System.out.println("Rate of interest of bank is 5%");
    }
}

class SBI extends Bank {
    @Override
        void interest() {
        System.out.println("Rate of interest of SBI is 6%");
    }
}

class PNB extends Bank {
    @Override
        void interest() {
        System.out.println("Rate of interest of PNB is 6.5%");
    }
}


public class Main2 {
    public static void main(String[] args) {
        Bank obj = new Bank();
        SBI obj1 = new SBI();
        PNB obj2 = new PNB();

        obj.interest();
        obj1.interest();
        obj2.interest();
    }
}
