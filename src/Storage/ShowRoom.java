package Storage;

import Cars.Car;

import java.util.ArrayList;

public class ShowRoom {
    public final double radius;
    public ArrayList<Car> storedCars;

    public ShowRoom(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public ArrayList<Car> getStoredCars() {
        return storedCars;
    }

    public void setStoredCars(ArrayList<Car> storedCars) {
        this.storedCars = storedCars;
    }
}
