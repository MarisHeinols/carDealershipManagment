package Order;

import Cars.Car;

import java.util.ArrayList;

public interface Order {
    void addItem(Car car);
    void setCost(double cost);
    double getCost();
}
