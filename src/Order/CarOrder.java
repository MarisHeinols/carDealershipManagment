package Order;

import Cars.Car;

import java.util.ArrayList;

public class CarOrder implements Order{
    private ArrayList<Car> orderedCars = new ArrayList<Car>();
    private double cost;

    public CarOrder(Car orderedCar, double shippingCost){
        this.orderedCars.add(orderedCar);
        this.cost = orderedCar.getPrice() + shippingCost;
    }
    @Override
    public void setCost(double cost) {
        this.cost += cost;
    }

    @Override
    public void addItem(Car car) {
        this.orderedCars.add(car);
        setCost(car.getPrice());
    }

    @Override
    public double getCost() {
        return cost;
    }

}
