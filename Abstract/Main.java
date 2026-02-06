package Abstract;

// Abstract is used to hide details and show only important information.
// Accecc:- 1. Abstract class,  2. Interface



abstract class Car{
// abstract Method
    abstract public void fueltype();

    // normal Method
    public void color() {
        System.out.println("Black Color");
    }
}

class Tata extends Car{
    
    public void fueltype() {
        System.out.println("Diesel");
    }
}

public class Main {
    public static void main(String[] args) {
        Tata nexon = new Tata();
        nexon.fueltype();
        nexon.color();
    }
}
