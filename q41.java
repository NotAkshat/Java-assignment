class Vehicle {
    protected String regnNumber, color, ownerName;
    protected int speed;

    void showData() {
        System.out.println("This is a vehicle class");
    }
}

class Bus extends Vehicle {
    int routeNumber;

    Bus(String regnNumber, int speed, String color, String ownerName, int routeNumber) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
        this.routeNumber = routeNumber;
    }

    void showData() {
        super.showData();
        System.out.println("Bus Route Number: " + routeNumber + ", Registration Number: " + regnNumber);
    }
}

class Car extends Vehicle {
    String manufacturerName;

    Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
        this.manufacturerName = manufacturerName;
    }

    void showData() {
        super.showData();
        System.out.println("Car Manufacturer: " + manufacturerName + ", Registration Number: " + regnNumber);
    }
}

public class q41 {
    public static void main(String[] args) {
        Bus bus = new Bus("1234", 60, "Blue", "John Doe", 45);
        bus.showData();
        Car car = new Car("5678", 120, "Red", "Jane Doe", "Toyota");
        car.showData();
    }
}
