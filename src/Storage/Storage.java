package Storage;

import java.util.ArrayList;
import Cars.Car;
public class Storage {
    public double width;
    public ArrayList<Car> storedCars;
    public Storage() {}
    public Storage(double width) {
        this.width = width;
    }

    public ArrayList<Car> getStoredCars() {
        return storedCars;
    }

    public void setStoredCars(ArrayList<Car> storedCars) {
        this.storedCars = storedCars;
    }
    public double getArea(){
        return width*width;
    }
}
