package Order;

import Cars.Car;

public class OrderDecarator implements Order{
    private Order wrappee;

    OrderDecarator(Order source) {
        this.wrappee = source;
    }
    @Override
    public void addItem(Car car) {
        wrappee.addItem(car);
    }

    @Override
    public void setCost(double cost) {
        wrappee.setCost(cost);
    }

    @Override
    public double getCost() {
        return wrappee.getCost();
    }
}
