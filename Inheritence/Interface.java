package Inheritence;

interface Car {

    public void start();
}

class ElectricCar implements Car{
    public void start() {
        System.out.println("Electric car Starts");
    }
}

class DieselCar implements Car{
    public void start() {
        System.out.println("diesel Car Starts");
    }
}

public class Interface {
    public static void main(String[] args) {
        Car Tata = new ElectricCar();
        Car XUV700 = new DieselCar();
        Tata.start();
        XUV700.start();
    }
}
