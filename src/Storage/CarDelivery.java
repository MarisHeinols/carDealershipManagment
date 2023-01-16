package Storage;

import java.util.ArrayList;
import Cars.Car;
public class CarDelivery {
    private final ArrayList<Car> cars;

    public CarDelivery(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public double getDeliveredCarsArea(){
        double area = 0;
        for(Car car:cars){
            // Plus one for the space around the car
            area += car.getLength() + 1 * car.getWight() + 1;
        }
        return area;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public boolean fits(Storage storage){
        return storage.getArea() >= getDeliveredCarsArea();
    }
}
