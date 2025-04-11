import java.util.Scanner;

public class TestVehicle {

    
    static class Vehicle {
        private String brand;
        private int speed;
        private String fuelType;

        public Vehicle(String brand, int speed, String fuelType) {
            this.brand = brand;
            this.speed = speed;
            this.fuelType = fuelType;
        }

        public String getBrand() {
            return brand;
        }

        public int getSpeed() {
            return speed;
        }

        public String getFuelType() {
            return fuelType;
        }

        public void displayInfo() {
            System.out.println("Brand: " + brand);
            System.out.println("Speed: " + speed + " km/h");
            System.out.println("Fuel Type: " + fuelType);
        }
    }

    
    static class Car extends Vehicle {
        private int numDoors;

        public Car(String brand, int speed, String fuelType, int numDoors) {
            super(brand, speed, fuelType);
            this.numDoors = numDoors;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Number of Doors: " + numDoors);
        }
    }

    
    static class Motorcycle extends Vehicle {
        private boolean hasSidecar;

        public Motorcycle(String brand, int speed, String fuelType, boolean hasSidecar) {
            super(brand, speed, fuelType);
            this.hasSidecar = hasSidecar;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter details for the Car:");
        System.out.print("Brand: ");
        String carBrand = sc.nextLine();

        System.out.print("Speed: ");
        int carSpeed = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Fuel Type: ");
        String carFuel = sc.nextLine();

        System.out.print("Number of Doors: ");
        int numDoors = sc.nextInt();
        sc.nextLine(); 

        Car car = new Car(carBrand, carSpeed, carFuel, numDoors);

        
        System.out.println("\nEnter details for the Motorcycle:");
        System.out.print("Brand: ");
        String motoBrand = sc.nextLine();

        System.out.print("Speed: ");
        int motoSpeed = sc.nextInt();
        sc.nextLine();

        System.out.print("Fuel Type: ");
        String motoFuel = sc.nextLine();

        System.out.print("Has Sidecar? (With/Without): ");
        boolean hasSidecar = sc.nextBoolean();

        Motorcycle motorcycle = new Motorcycle(motoBrand, motoSpeed, motoFuel, hasSidecar);

        
        System.out.println("\nVehicle Information:\n");
        car.displayInfo();
        System.out.println();
        motorcycle.displayInfo();

        sc.close();
    }
}
