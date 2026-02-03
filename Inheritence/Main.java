package Inheritence;

class Vehicle {
    double price;
    double milage;
    String color;

    void disp() {
        System.out.println("Price: "+ price);
        System.out.println("Mileage: "+ milage);
        System.out.println("Color: "+ color);
    }
}

class Car extends Vehicle {
    String ftype;
    String brand;
    boolean sunroof;
}


public class Main {
    public static void main(String[] args) {
        
        Car car1 = new Car();
        car1.brand = "Tata";
        car1.price = 150000;
        car1.milage = 18.0;
        car1.ftype = "Petrol";
        car1.color = "Red";
        car1.sunroof = true;
        car1.disp();
        System.out.println(car1.sunroof);
    }
}
 