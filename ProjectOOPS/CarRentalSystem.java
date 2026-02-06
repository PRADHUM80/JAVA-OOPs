package ProjectOOPS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// class 1

class Car{
    private String carId;
    private String brand;
    private String model;
    private double basePricePerDay;
    private boolean isAvailable;


    // constructor.
    public Car(String carId, String brand, String model, double basePricePerDay) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.basePricePerDay = basePricePerDay;
        this.isAvailable = true;
    }
     // get Methods.
         public String getCarId() {
         return carId;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }
        public double calculatePrice(int rentalDays) {
            return basePricePerDay * rentalDays;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        public void rent() {
            isAvailable = false;
        }

        public void returnCar() {
            isAvailable = true;
        }
}


// Class Customer...

class Customer {
    private String customerId;
    private String name;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    // get..

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }
}

// Class Rental .

class Rental {
    private Car car;
    private Customer customer; // obj class ka type.
    private int days;

    // Constructor
    public Rental(Car car, Customer customer, int days) {
        this.car = car;
        this.customer = customer;
        this.days = days;
    }
    // get

    public Car getCar() {
        return car;
    }
    public Customer getCustomer() {
        return customer;
    }
    public int getDays() {
        return days;
    }
}

//  Main class..
public class CarRentalSystem {
    private List<Car> cars;
    private List<Customer> customers;
    private List<Rental> rentals;

    public CarRentalSystem() {
        cars = new ArrayList<>();
        customers = new ArrayList<>();
        rentals = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void rentCar(Car car, Customer customer, int days) {
        if(car.isAvailable()) {
            car.rent();
            rentals.add(new Rental(car, customer, days));
        } else {
            System.out.println("Car is not Available for rent.");
        }
    }


    public void returnCar(Car car) {
        car.returnCar();
        Rental rentalToRemove = null;
        for(Rental rental : rentals) {
            if(rental.getCar() == car) {
                rentalToRemove = rental;
                break;
            }
        }
        if(rentalToRemove != null) {
            rentals.remove(rentalToRemove);
            System.out.println("Car returned successfully.");
        } else {
            System.out.println("Car was not Rented.");
        }
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=== Car Rental System =====");
            System.out.println("1. Rent a Car");
            System.out.println("2. Return a Car");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newLine
        }
    }

}
